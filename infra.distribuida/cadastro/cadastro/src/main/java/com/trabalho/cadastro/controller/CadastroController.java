package com.trabalho.cadastro.CadastroController;

@RestController
@RequestMapping("/cadastrar")
public class CadastroController {

    @Autowired
    private CadastroService cadastroService;

    @PostMapping
    public ResponseEntity<String> cadastrar(@RequestBody Usuario usuario) {
        cadastroService.cadastrarUsuario(usuario);
        return ResponseEntity.ok("Usuário cadastrado com sucesso");
    }
}
