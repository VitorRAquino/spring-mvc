package br.com.mvc.mudi.dto;

import br.com.mvc.mudi.model.Pedido;

import javax.validation.constraints.NotBlank;

public class RequisicaoNovoPedido {

    @NotBlank(message = "O campo do produto é obrigatório.")
    private String nomeProduto;
    @NotBlank(message = "O campo da URL do produto é obrigatório.")
    private String urlDoProduto;
    @NotBlank(message = "O campo da URL da imagem é obrigatório.")
    private String urlDaImagem;
    @NotBlank
    private String descricao;

    public String getNomeProduto() {
        return nomeProduto;
    }

    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
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

    public Pedido toPedido() {
        Pedido pedido = new Pedido();
        pedido.setDescricao(descricao);
        pedido.setNomeProduto(nomeProduto);
        pedido.setUrlDoProduto(urlDoProduto);
        pedido.setUrlDaImagem(urlDaImagem);
        return null;
    }
}
