package com.consulta.brasil.model;

import java.time.LocalDateTime;

public class QsaDTO {
    private Integer identificador_de_socio;

    private String nome_socio;

    private String cnpj_cpf_do_socio;

    private Integer codigo_qualificacao_socio;

    private Integer percentual_capital_social;

    private LocalDateTime data_entrada_sociedade;

    private String cpf_representante_legal;

    private String nome_representante_legal;

    private Integer codigo_qualificacao_representante_legal;

    /**
     * Gets the identificador
     * @return
     */
    public Integer getIdentificador_de_socio() {
        return identificador_de_socio;
    }

    /**
     * Sets the identificador
     * @param identificador_de_socio
     */
    public void setIdentificador_de_socio(Integer identificador_de_socio) {
        this.identificador_de_socio = identificador_de_socio;
    }

    /**
     * Gets the nome socio
     * @return
     */
    public String getNome_socio() {
        return nome_socio;
    }

    /**
     * Sets the nome socio
     * @param nome_socio
     */
    public void setNome_socio(String nome_socio) {
        this.nome_socio = nome_socio;
    }

    /**
     * GEts the cnpj cpf socio
     * @return
     */
    public String getCnpj_cpf_do_socio() {
        return cnpj_cpf_do_socio;
    }

    /**
     * SEts the cpf cnpj
     * @param cnpj_cpf_do_socio
     */
    public void setCnpj_cpf_do_socio(String cnpj_cpf_do_socio) {
        this.cnpj_cpf_do_socio = cnpj_cpf_do_socio;
    }

    /**
     * Gets the codigo qualificacao
     * @return
     */
    public Integer getCodigo_qualificacao_socio() {
        return codigo_qualificacao_socio;
    }

    /**
     * Sets the codigo qualificacao
     * @param codigo_qualificacao_socio
     */
    public void setCodigo_qualificacao_socio(Integer codigo_qualificacao_socio) {
        this.codigo_qualificacao_socio = codigo_qualificacao_socio;
    }

    /**
     * Gets the percentual capital
     * @return
     */
    public Integer getPercentual_capital_social() {
        return percentual_capital_social;
    }

    /**
     * Sets the percentual capital
     * @param percentual_capital_social
     */
    public void setPercentual_capital_social(Integer percentual_capital_social) {
        this.percentual_capital_social = percentual_capital_social;
    }

    /**
     * Gets the data entrada
     * @return
     */
    public LocalDateTime getData_entrada_sociedade() {
        return data_entrada_sociedade;
    }

    /**
     * Sets the data entrada sociedade
     * @param data_entrada_sociedade
     */
    public void setData_entrada_sociedade(LocalDateTime data_entrada_sociedade) {
        this.data_entrada_sociedade = data_entrada_sociedade;
    }

    /**
     * Gets the cpf representante legal
     * @return
     */
    public String getCpf_representante_legal() {
        return cpf_representante_legal;
    }

    /**
     * Sets the cpf representante legal
     * @param cpf_representante_legal
     */
    public void setCpf_representante_legal(String cpf_representante_legal) {
        this.cpf_representante_legal = cpf_representante_legal;
    }

    /**
     * Gets the nome representante legal
     * @return
     */
    public String getNome_representante_legal() {
        return nome_representante_legal;
    }

    /**
     * Sets the nome representante legal
     * @param nome_representante_legal
     */
    public void setNome_representante_legal(String nome_representante_legal) {
        this.nome_representante_legal = nome_representante_legal;
    }

    /**
     * Gets the codigo qualificacao
     * @return
     */
    public Integer getCodigo_qualificacao_representante_legal() {
        return codigo_qualificacao_representante_legal;
    }

    /**
     * Gets the codigo qualificacao
     * @param codigo_qualificacao_representante_legal
     */
    public void setCodigo_qualificacao_representante_legal(Integer codigo_qualificacao_representante_legal) {
        this.codigo_qualificacao_representante_legal = codigo_qualificacao_representante_legal;
    }

    

}
