/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author LN710Q
 */
public class Filtro {
    private int id;
    private String codigo;
    private String Marca;
    private int Stock;
    private boolean existencia;
    
    public Filtro (int id,String codigo,String Marca, int Stock,boolean existencia){
      this.id=id;
      this.Marca=Marca;
      this.Stock=Stock;
      this.existencia=existencia;
      this.codigo=codigo;
      
    }
    
    public Filtro (String codigo, String Marca, int Stock,boolean existencia){
        this.Marca=Marca;
        this.Stock=Stock;
        this.existencia=existencia;
        
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getMarca() {
        return Marca;
    }

    public void setMarca(String Marca) {
        this.Marca = Marca;
    }

    public int getStock() {
        return Stock;
    }

    public void setStock(int Stock) {
        this.Stock = Stock;
    }

    public boolean isExistencia() {
        return existencia;
    }

    public void setExistencia(boolean existencia) {
        this.existencia = existencia;
    }

   

   
}
