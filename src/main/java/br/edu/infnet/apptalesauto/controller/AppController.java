package br.edu.infnet.apptalesauto.controller;

import br.edu.infnet.apptalesauto.client.AppTalesAutoClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AppController {

    @Autowired
    AppTalesAutoClient appTalesAutoClient;

    @GetMapping(value = "/")
    public String telaHome(Model model) {

        model.addAttribute("qtdeConcessionaria", appTalesAutoClient.obterListaConcessionaria().size());
        model.addAttribute("qtdCarro", appTalesAutoClient.obterListaCarros().size());
        model.addAttribute("qtdeMoto", appTalesAutoClient.obterListaMotos().size());
        model.addAttribute("qtdeVendedor", appTalesAutoClient.obterListaVendedores().size());
        model.addAttribute("qtdeVenda", appTalesAutoClient.obterListaVendas().size());

        return "home";
    }

    @GetMapping(value = "/concessionaria/listagem")
    public String listarConcessionaria(Model model) {

        model.addAttribute("titulo", "Listagem de Concessionárias");
        model.addAttribute("listagem", appTalesAutoClient.obterListaConcessionaria());

        return telaHome(model);
    }

    @GetMapping(value = "/carro/listagem")
    public String listarCarro(Model model) {

        model.addAttribute("titulo", "Listagem de Carros");
        model.addAttribute("listagem", appTalesAutoClient.obterListaCarros());

        return telaHome(model);
    }

    @GetMapping(value = "/moto/listagem")
    public String listarMoto(Model model) {

        model.addAttribute("titulo", "Listagem de Motos");
        model.addAttribute("listagem", appTalesAutoClient.obterListaMotos());

        return telaHome(model);
    }

    @GetMapping(value = "/vendedor/listagem")
    public String listarVendedor(Model model) {

        model.addAttribute("titulo", "Listagem de Vendedores");
        model.addAttribute("listagem", appTalesAutoClient.obterListaVendedores());

        return telaHome(model);
    }

    @GetMapping(value = "/venda/listagem")
    public String listarVenda(Model model) {

        model.addAttribute("titulo", "Listagem de Vendas");
        model.addAttribute("listagem", appTalesAutoClient.obterListaVendas());

        return telaHome(model);
    }

}
