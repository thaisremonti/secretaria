package controller;

import javax.inject.Inject;

import br.com.caelum.vraptor.Controller;
import br.com.caelum.vraptor.Get;
import br.com.caelum.vraptor.Result;
import br.com.caelum.vraptor.view.Results;
import service.LoginService;

@Controller
public class LoginController {

    @Inject LoginService loginService;
    @Inject Result result;

    @Get("/secretaria")
    public void login() {
        result.forwardTo("/WebContent/login.jsp");
    }

    @Get("login/logar")
    public void buscarTipoComsusPadrao(Integer ra, String senha) {
        Boolean  busca = loginService.validaLogin(ra, senha);
        result.use(Results.json()).withoutRoot().from(busca).serialize();
    }
}
