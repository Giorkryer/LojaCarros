package com.minhaloja.carros.controller;

import com.minhaloja.carros.service.RelatorioService;
import net.sf.jasperreports.engine.JRException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/relatorios")
public class RelatorioController {

    @Autowired
    private RelatorioService relatorioService;

    @GetMapping("/carros")
    public ResponseEntity<byte[]> downloadRelatorio() throws JRException {
        byte[] relatorio = relatorioService.gerarRelatorio();
        HttpHeaders headers = new HttpHeaders();
        headers.add("Content-Disposition", "inline; filename=relatorio.pdf");
        return ResponseEntity.ok().headers(headers).body(relatorio);
    }
}
