package com.projects.praticandoAPI;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultMatcher;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;


@RunWith(SpringRunner.class)
@ComponentScan(basePackages = {"com.projects.praticandoAPI"})
@SpringBootTest
@AutoConfigureMockMvc


public class ComentarioApiAplicationTest {
    @Autowired
    private MockMvc mockMvc;
    
    @Test
    public void testCreateUsuarioDefault() throws Exception{
    	final String expectedMensagem = "Comentario05";

        mockMvc
            .perform(MockMvcRequestBuilders.post("/comentarios").contentType(MediaType.APPLICATION_JSON).content("{\"mensagem\":\"Comentario05\"}"))
            .andExpect(MockMvcResultMatchers.status().is(201))
            .andExpect((ResultMatcher) jsonPath("mensagem").value(expectedMensagem));
    }
    
}
    
