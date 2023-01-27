/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Beans;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Leandro Marques
 */
public class PedidoBeans {

    private int codigoPedido;
    private int codigoCliente;
    private int codigoFuncionario;
    private int codigoEntregador;
    private String data;
    private String hora;
    private Double valor;
    private String status;
    private List<Integer> codCardapio;
    private List<Integer> quantidade;

    public PedidoBeans() {
        codCardapio = new ArrayList<>();
        quantidade = new ArrayList<>();

    }

    public int getCodigoPedido() {
        return codigoPedido;
    }

    public void setCodigoPedido(int codigoPedido) {
        this.codigoPedido = codigoPedido;
    }

    public int getCodigoCliente() {
        return codigoCliente;
    }

    public void setCodigoCliente(int codigoCliente) {
        this.codigoCliente = codigoCliente;
    }

    public int getCodigoFuncionario() {
        return codigoFuncionario;
    }

    public void setCodigoFuncionario(int codigoFuncionario) {
        this.codigoFuncionario = codigoFuncionario;
    }

    public int getCodigoEntregador() {
        return codigoEntregador;
    }

    public void setCodigoEntregador(int codigoEntregador) {
        this.codigoEntregador = codigoEntregador;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getCodCardapio(int posicao) {
        return codCardapio.get(posicao);
    }

    public void setCodCardapio(int codCardapio) {
        this.codCardapio.add(codCardapio);
    }

    public int getQuantidade(int posicao) {
        return quantidade.get(posicao);
    }

    public void setQuantidade(int quantidade) {
        this.quantidade.add(quantidade);
    }
    

}
