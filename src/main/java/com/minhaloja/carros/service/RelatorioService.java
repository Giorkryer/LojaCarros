package com.minhaloja.carros.service;

import net.sf.jasperreports.engine.*;
import org.springframework.stereotype.Service;

@Service
public class RelatorioService {

    public byte[] gerarRelatorio() throws JRException {
        JasperReport jasperReport = JasperCompileManager.compileReport("caminho/do/relatorio.jrxml");
        JasperPrint jasperPrint = JasperFillManager.fillReport(jasperReport, null, new JREmptyDataSource());
        return JasperExportManager.exportReportToPdf(jasperPrint);
    }
}
