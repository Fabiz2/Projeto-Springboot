package br.com.fecaf.controller;

import br.com.fecaf.model.Mineral;
import org.springframework.web.bind.annotation.*;
import jakarta.annotation.PostConstruct;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/v1/minerais")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class MineralController {

    private List<Mineral> minerais = new ArrayList<>();

    // 🔹 O método será chamado automaticamente ao iniciar a aplicação
    @PostConstruct
    public void carregarJson() {
        try {
            ObjectMapper objectMapper = new ObjectMapper();
            InputStream inputStream = getClass()
                    .getResourceAsStream("/data/minerais.json");

            minerais = objectMapper.readValue(inputStream, new TypeReference<List<Mineral>>() {});
            System.out.println("💎 JSON de minerais carregado com sucesso: " + minerais.size() + " minerais.");
        } catch (Exception e) {
            System.err.println("❌ Erro ao carregar o JSON de minerais: " + e.getMessage());
        }
    }

    // ✅ GET - lista todos os minerais
    @GetMapping
    public List<Mineral> listarMinerais() {
        return minerais;
    }
}