package br.com.fecaf.model;

public class Mineral {

    private Long id;
    private String nome;
    private String categoria; // Metaloide, Metal Nativo, Óxido, Sulfeto, Silicato, Carbonato, Sulfato
    private String formulaQuimica;
    private String corPrincipal;
    private String sistemaCristalino; // Cúbico, Hexagonal, Tetragonal, Ortorrômbico, Monoclínico, Triclínico
    private double durezaMohs; // Escala de 1 a 10
    private double densidade; // g/cm³
    private double pontoFusao; // °C
    private String brilho; // Metálico, Vítreo, Resinoso, Pérola, etc.
    private String transparencia; // Transparente, Translúcido, Opaco
    private double valorMercado; // Valor por grama em reais
    private String localizacaoPrincipal; // Principal local de extração
    private String aplicacoes; // Usos industriais, joalheria, tecnologia
    private String raridade; // Comum, Incomum, Raro, Muito Raro, Extremamente Raro
    private String status; // Disponível, Escasso, Indisponível, Protegido

    // 🔹 Getters e Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getFormulaQuimica() {
        return formulaQuimica;
    }

    public void setFormulaQuimica(String formulaQuimica) {
        this.formulaQuimica = formulaQuimica;
    }

    public String getCorPrincipal() {
        return corPrincipal;
    }

    public void setCorPrincipal(String corPrincipal) {
        this.corPrincipal = corPrincipal;
    }

    public String getSistemaCristalino() {
        return sistemaCristalino;
    }

    public void setSistemaCristalino(String sistemaCristalino) {
        this.sistemaCristalino = sistemaCristalino;
    }

    public double getDurezaMohs() {
        return durezaMohs;
    }

    public void setDurezaMohs(double durezaMohs) {
        this.durezaMohs = durezaMohs;
    }

    public double getDensidade() {
        return densidade;
    }

    public void setDensidade(double densidade) {
        this.densidade = densidade;
    }

    public double getPontoFusao() {
        return pontoFusao;
    }

    public void setPontoFusao(double pontoFusao) {
        this.pontoFusao = pontoFusao;
    }

    public String getBrilho() {
        return brilho;
    }

    public void setBrilho(String brilho) {
        this.brilho = brilho;
    }

    public String getTransparencia() {
        return transparencia;
    }

    public void setTransparencia(String transparencia) {
        this.transparencia = transparencia;
    }

    public double getValorMercado() {
        return valorMercado;
    }

    public void setValorMercado(double valorMercado) {
        this.valorMercado = valorMercado;
    }

    public String getLocalizacaoPrincipal() {
        return localizacaoPrincipal;
    }

    public void setLocalizacaoPrincipal(String localizacaoPrincipal) {
        this.localizacaoPrincipal = localizacaoPrincipal;
    }

    public String getAplicacoes() {
        return aplicacoes;
    }

    public void setAplicacoes(String aplicacoes) {
        this.aplicacoes = aplicacoes;
    }

    public String getRaridade() {
        return raridade;
    }

    public void setRaridade(String raridade) {
        this.raridade = raridade;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    // 🔹 Método toString (útil para depuração e logs)
    @Override
    public String toString() {
        return "Mineral{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", categoria='" + categoria + '\'' +
                ", formulaQuimica='" + formulaQuimica + '\'' +
                ", corPrincipal='" + corPrincipal + '\'' +
                ", sistemaCristalino='" + sistemaCristalino + '\'' +
                ", durezaMohs=" + durezaMohs +
                ", densidade=" + densidade +
                ", pontoFusao=" + pontoFusao +
                ", brilho='" + brilho + '\'' +
                ", transparencia='" + transparencia + '\'' +
                ", valorMercado=" + valorMercado +
                ", localizacaoPrincipal='" + localizacaoPrincipal + '\'' +
                ", aplicacoes='" + aplicacoes + '\'' +
                ", raridade='" + raridade + '\'' +
                ", status='" + status + '\'' +
                '}';
    }
}