package br.com.bb.controller;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.web.context.WebApplicationContext;

import br.com.bb.Application;

import static org.hamcrest.Matchers.*;
import static org.springframework.test.web.servlet.setup.MockMvcBuilders.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;


@RunWith(SpringRunner.class)
@SpringBootTest(classes = Application.class)
@WebAppConfiguration
public class ProductControllerTest {

	@Autowired
    private WebApplicationContext webApplicationContext;

	private MockMvc mockMvc;

	@Before
    public void setup() throws Exception {
        this.mockMvc = webAppContextSetup(webApplicationContext).build();
	}

	@Test
    public void listByCategoryEletronics() throws Exception {
        mockMvc.perform(get("/product/listByCategory/1"))
        .andExpect(status().isOk())
	    		.andExpect(jsonPath("$", hasSize(4)))
	        .andExpect(jsonPath("$[0].identifier", is(1)))
	        .andExpect(jsonPath("$[0].name", is("ACCESSORIES & SUPPLIES")))
	        .andExpect(jsonPath("$[1].identifier", is(2)))
	        .andExpect(jsonPath("$[1].name", is("CAMERA & PHOTO")))
	        .andExpect(jsonPath("$[2].identifier", is(3)))
	        .andExpect(jsonPath("$[2].name", is("CAR & VEHICLE ELECTRONICS")))
	        .andExpect(jsonPath("$[3].identifier", is(4)))
	        .andExpect(jsonPath("$[3].name", is("CELL PHONES & ACCESSORIES")));
    }

	@Test
	public void listByCategorySoftware() throws Exception {
		mockMvc.perform(get("/product/listByCategory/2"))
		.andExpect(status().isOk())
		.andExpect(jsonPath("$", hasSize(4)))
		.andExpect(jsonPath("$[0].identifier", is(5)))
		.andExpect(jsonPath("$[0].name", is("ACCOUNTING & FINANCE")))
		.andExpect(jsonPath("$[1].identifier", is(6)))
		.andExpect(jsonPath("$[1].name", is("ANTIVIRUS & SECURITY")))
		.andExpect(jsonPath("$[2].identifier", is(7)))
		.andExpect(jsonPath("$[2].name", is("BUSINESS & OFFICE")))
		.andExpect(jsonPath("$[3].identifier", is(8)))
		.andExpect(jsonPath("$[3].name", is("DESIGN & ILLUSTRATION")));
	}

}
