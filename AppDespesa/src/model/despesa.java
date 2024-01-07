package model;

public class despesa {
    //despesa={data,@doc,@nr,descricao,valor}
    private String data;
    private  String documento;
    private  String serieDoc;
    private  String descricao;
    private  double valor;

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public String getSerieDoc() {
        return serieDoc;
    }

    public void setSerieDoc(String serieDoc) {
        this.serieDoc = serieDoc;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    //construtor da classe
    public despesa(String data, String tipoDoc,String serieDocumento,String descricao,double valor ){
        this.data=data;
        this.documento=tipoDoc;
        this.serieDoc=serieDocumento;
        this.descricao=descricao;
        this.valor=valor;
    }
    public despesa(){}
}
