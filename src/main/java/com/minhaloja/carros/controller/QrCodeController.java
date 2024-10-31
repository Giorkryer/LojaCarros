package com.minhaloja.carros.controller;

import com.google.zxing.WriterException;
import com.minhaloja.carros.model.Carro;
import com.minhaloja.carros.service.CarroService;
import com.minhaloja.carros.service.QrCodeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;

@RestController
@RequestMapping("/qrcode")
public class QrCodeController {

    @Autowired
    private QrCodeService qrCodeService;

    @Autowired
    private CarroService carroService;

    @GetMapping("/{id}")
    public ResponseEntity<byte[]> gerarQrCode(@PathVariable Long id) throws WriterException, IOException {
        Carro carro = carroService.findById(id);
        if (carro != null) {
            String texto = "Marca: " + carro.getMarca() + ", Modelo: " + carro.getModelo() + ", Ano: " + carro.getAno();
            byte[] qrCode = qrCodeService.gerarQrCode(texto);
            HttpHeaders headers = new HttpHeaders();
            headers.setContentType(MediaType.IMAGE_PNG);
            return ResponseEntity.ok().headers(headers).body(qrCode);
        }
        return ResponseEntity.notFound().build();
    }
}
