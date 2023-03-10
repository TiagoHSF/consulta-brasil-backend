package com.consulta.brasil.model;

import java.time.LocalDateTime;
import java.util.List;

public class ConsultaCNPJDTO {
    
    private String cnpj;

    private Integer identificador_matriz_filial;

    private String descricao_matriz_filia;

    private String razao_social;

    private String nome_fantasia;

    private Integer situacao_cadastral;

    private String descricao_situacao_cadastral;

    private LocalDateTime data_situacao_cadastral;

    private Integer motivo_situacao_cadastral;

    private String nome_cidade_exterior;

    private Long codigo_natureza_juridica;

    private LocalDateTime data_inicio_atividade;

    private Long cnae_fiscal;

    private String cnae_fiscal_descricao;
    
    private String descricao_tipo_logradouro;

    private String logradouro;

    private String numero;

    private String complemento;

    private String bairro;

    private Long cep;

    private String uf;

    private Long codigo_municipio;

    private String municipio;

    private String ddd_telefone_1;

    private String ddd_telefone_2;

    private String ddd_fax;

    private Integer qualificacao_do_responsavel;

    private Integer capital_social;

    private Integer porte;

    private String descricao_porte;

    private Boolean opcao_pelo_simples;

    private LocalDateTime data_opcao_pelo_simples;
    
    private LocalDateTime data_exclusao_do_simples;

    private Boolean opcao_pelo_mei;

    private String situacao_especial;

    private LocalDateTime data_situacao_especial;

    private List<CnaeDTO> cnaes_secundarios;

    private List<QsaDTO> qsa;

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public Integer getIdentificador_matriz_filial() {
        return identificador_matriz_filial;
    }

    public void setIdentificador_matriz_filial(Integer identificador_matriz_filial) {
        this.identificador_matriz_filial = identificador_matriz_filial;
    }

    public String getDescricao_matriz_filia() {
        return descricao_matriz_filia;
    }

    public void setDescricao_matriz_filia(String descricao_matriz_filia) {
        this.descricao_matriz_filia = descricao_matriz_filia;
    }

    public String getRazao_social() {
        return razao_social;
    }

    public void setRazao_social(String razao_social) {
        this.razao_social = razao_social;
    }

    public String getNome_fantasia() {
        return nome_fantasia;
    }

    public void setNome_fantasia(String nome_fantasia) {
        this.nome_fantasia = nome_fantasia;
    }

    public Integer getSituacao_cadastral() {
        return situacao_cadastral;
    }

    public void setSituacao_cadastral(Integer situacao_cadastral) {
        this.situacao_cadastral = situacao_cadastral;
    }

    public String getDescricao_situacao_cadastral() {
        return descricao_situacao_cadastral;
    }

    public void setDescricao_situacao_cadastral(String descricao_situacao_cadastral) {
        this.descricao_situacao_cadastral = descricao_situacao_cadastral;
    }

    public LocalDateTime getData_situacao_cadastral() {
        return data_situacao_cadastral;
    }

    public void setData_situacao_cadastral(LocalDateTime data_situacao_cadastral) {
        this.data_situacao_cadastral = data_situacao_cadastral;
    }

    public Integer getMotivo_situacao_cadastral() {
        return motivo_situacao_cadastral;
    }

    public void setMotivo_situacao_cadastral(Integer motivo_situacao_cadastral) {
        this.motivo_situacao_cadastral = motivo_situacao_cadastral;
    }

    public String getNome_cidade_exterior() {
        return nome_cidade_exterior;
    }

    public void setNome_cidade_exterior(String nome_cidade_exterior) {
        this.nome_cidade_exterior = nome_cidade_exterior;
    }

    public Long getCodigo_natureza_juridica() {
        return codigo_natureza_juridica;
    }

    public void setCodigo_natureza_juridica(Long codigo_natureza_juridica) {
        this.codigo_natureza_juridica = codigo_natureza_juridica;
    }

    public LocalDateTime getData_inicio_atividade() {
        return data_inicio_atividade;
    }

    public void setData_inicio_atividade(LocalDateTime data_inicio_atividade) {
        this.data_inicio_atividade = data_inicio_atividade;
    }

    public Long getCnae_fiscal() {
        return cnae_fiscal;
    }

    public void setCnae_fiscal(Long cnae_fiscal) {
        this.cnae_fiscal = cnae_fiscal;
    }

    public String getCnae_fiscal_descricao() {
        return cnae_fiscal_descricao;
    }

    public void setCnae_fiscal_descricao(String cnae_fiscal_descricao) {
        this.cnae_fiscal_descricao = cnae_fiscal_descricao;
    }

    public String getDescricao_tipo_logradouro() {
        return descricao_tipo_logradouro;
    }

    public void setDescricao_tipo_logradouro(String descricao_tipo_logradouro) {
        this.descricao_tipo_logradouro = descricao_tipo_logradouro;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public Long getCep() {
        return cep;
    }

    public void setCep(Long cep) {
        this.cep = cep;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    public Long getCodigo_municipio() {
        return codigo_municipio;
    }

    public void setCodigo_municipio(Long codigo_municipio) {
        this.codigo_municipio = codigo_municipio;
    }

    public String getMunicipio() {
        return municipio;
    }

    public void setMunicipio(String municipio) {
        this.municipio = municipio;
    }

    public String getDdd_telefone_1() {
        return ddd_telefone_1;
    }

    public void setDdd_telefone_1(String ddd_telefone_1) {
        this.ddd_telefone_1 = ddd_telefone_1;
    }

    public String getDdd_telefone_2() {
        return ddd_telefone_2;
    }

    public void setDdd_telefone_2(String ddd_telefone_2) {
        this.ddd_telefone_2 = ddd_telefone_2;
    }

    public String getDdd_fax() {
        return ddd_fax;
    }

    public void setDdd_fax(String ddd_fax) {
        this.ddd_fax = ddd_fax;
    }

    public Integer getQualificacao_do_responsavel() {
        return qualificacao_do_responsavel;
    }

    public void setQualificacao_do_responsavel(Integer qualificacao_do_responsavel) {
        this.qualificacao_do_responsavel = qualificacao_do_responsavel;
    }

    public Integer getCapital_social() {
        return capital_social;
    }

    public void setCapital_social(Integer capital_social) {
        this.capital_social = capital_social;
    }

    public Integer getPorte() {
        return porte;
    }

    public void setPorte(Integer porte) {
        this.porte = porte;
    }

    public String getDescricao_porte() {
        return descricao_porte;
    }

    public void setDescricao_porte(String descricao_porte) {
        this.descricao_porte = descricao_porte;
    }

    public Boolean getOpcao_pelo_simples() {
        return opcao_pelo_simples;
    }

    public void setOpcao_pelo_simples(Boolean opcao_pelo_simples) {
        this.opcao_pelo_simples = opcao_pelo_simples;
    }

    public LocalDateTime getData_opcao_pelo_simples() {
        return data_opcao_pelo_simples;
    }

    public void setData_opcao_pelo_simples(LocalDateTime data_opcao_pelo_simples) {
        this.data_opcao_pelo_simples = data_opcao_pelo_simples;
    }

    public LocalDateTime getData_exclusao_do_simples() {
        return data_exclusao_do_simples;
    }

    public void setData_exclusao_do_simples(LocalDateTime data_exclusao_do_simples) {
        this.data_exclusao_do_simples = data_exclusao_do_simples;
    }

    public Boolean getOpcao_pelo_mei() {
        return opcao_pelo_mei;
    }

    public void setOpcao_pelo_mei(Boolean opcao_pelo_mei) {
        this.opcao_pelo_mei = opcao_pelo_mei;
    }

    public String getSituacao_especial() {
        return situacao_especial;
    }

    public void setSituacao_especial(String situacao_especial) {
        this.situacao_especial = situacao_especial;
    }

    public LocalDateTime getData_situacao_especial() {
        return data_situacao_especial;
    }

    public void setData_situacao_especial(LocalDateTime data_situacao_especial) {
        this.data_situacao_especial = data_situacao_especial;
    }

    public List<CnaeDTO> getCnaes_secundarios() {
        return cnaes_secundarios;
    }

    public void setCnaes_secundarios(List<CnaeDTO> cnaes_secundarios) {
        this.cnaes_secundarios = cnaes_secundarios;
    }

    public List<QsaDTO> getQsa() {
        return qsa;
    }

    public void setQsa(List<QsaDTO> qsa) {
        this.qsa = qsa;
    }


    
}
