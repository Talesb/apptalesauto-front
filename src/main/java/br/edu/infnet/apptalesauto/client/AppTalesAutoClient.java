package br.edu.infnet.apptalesauto.client;

import br.edu.infnet.apptalesauto.model.domain.Carro;
import br.edu.infnet.apptalesauto.model.domain.Concessionaria;
import br.edu.infnet.apptalesauto.model.domain.Moto;
import br.edu.infnet.apptalesauto.model.domain.Venda;
import br.edu.infnet.apptalesauto.model.domain.Vendedor;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@FeignClient(url = "http://localhost:8080", name = "appTalesAutoClient")
public interface AppTalesAutoClient {

    @GetMapping(value = "/concessionaria/listar/")
    List<Concessionaria> obterListaConcessionaria();

    @GetMapping(value = "/carro/listar/")
    List<Carro> obterListaCarros();

    @GetMapping(value = "/moto/listar/")
    List<Moto> obterListaMotos();

    @GetMapping(value = "/vendedor/listar/")
    List<Vendedor> obterListaVendedores();

    @GetMapping(value = "/venda/listar/")
    List<Venda> obterListaVendas();
}
