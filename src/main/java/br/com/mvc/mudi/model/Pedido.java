package br.com.mvc.mudi.model;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
public class Pedido {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    private String nomeProduto;
   private BigDecimal valorNegociado;
   private LocalDate dataDaEntrega;
   private String urlDoProduto;
   private String urlDaImagem;
   private String descricao;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNomeProduto() {
        return nomeProduto;
    }

    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }

    public BigDecimal getValorNegociado() {
        return valorNegociado;
    }

    public void setValorNegociado(BigDecimal valorNegociado) {
        this.valorNegociado = valorNegociado;
    }

    public LocalDate getDataDaEntrega() {
        return dataDaEntrega;
    }

    public void setDataDaEntrega(LocalDate dataDaEntrega) {
        this.dataDaEntrega = dataDaEntrega;
    }

    public String getUrlDoProduto() {
        return urlDoProduto;
    }

    public void setUrlDoProduto(String urlDoProduto) {
        this.urlDoProduto = urlDoProduto;
    }

    public String getUrlDaImagem() {
        return urlDaImagem;
    }

    public void setUrlDaImagem(String urlDaImagem) {
        this.urlDaImagem = urlDaImagem;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}