package BEANS;

import java.util.ArrayList;
import java.sql.*;
import DAO.conexion;

//conexion a la base de datos

public class comedor {
    private String Nombre;
    private String Apellido;
    private int cedula; 
    private int codigo;
    private String lunes;
    private String martes;
    private String miercoles;
    private String jueves;
    private String viernes;
    private String Semana;
    private int BusquedaCodigo;
    private String BusquedaNombre;
    private String Fecha;
    private String Alimento;
    private int Cantidad;
    
    
    public String EliminarRegistro(){
    conexion objmod = new conexion();
    String cad="delete from buscar";
    return objmod.Ejecutar(cad);
    }
    
    public String EliminarUsuario(){
    conexion objmod=new conexion();
    String cad="delete from agregar_usuarios where Codigo='"+this.getCodigo()+"'";
    return objmod.Ejecutar(cad);
    }
    
    public String Eliminarmenu(){
    conexion objmod = new conexion();
    String cad="delete from comidas";
    return objmod.Ejecutar(cad);
    }
    
    public String Almacenar(){
    conexion objmod = new conexion();
    String cad="insert into comidas values('"+this.getSemana()+"','"+this.getLunes()+
    "','"+this.getMartes()+"','"+this.getMiercoles()+
    "','"+this.getJueves()+"',"+"'"+this.getViernes()+"')";
    return objmod.Ejecutar(cad);
    }
    
    public String Guardar(){
    conexion objmod = new conexion();
    String cad="insert into buscar values('"+this.getBusquedaNombre()+"','"+this.getBusquedaCodigo()+
    "','"+this.getFecha()+"')";
    return objmod.Ejecutar(cad);
    }
    
    public ArrayList<comedor>Listamenu(){
        ArrayList lista3=new ArrayList();
        try{
        conexion objmod=new conexion();
        ResultSet tabla=objmod.Listar("select * from comidas");
        comedor objart;
            while(tabla.next()){
            objart=new comedor();
            objart.setSemana(tabla.getString("semana"));
            objart.setLunes(tabla.getString("lunes"));
            objart.setMartes(tabla.getString("martes"));
            objart.setMiercoles(tabla.getString("miercoles"));
            objart.setJueves(tabla.getString("jueves"));
            objart.setViernes(tabla.getString("viernes"));
            lista3.add(objart);
        }
    }catch(Exception e){
    javax.swing.JOptionPane.showMessageDialog(null,
    e.getMessage());
    }
        return lista3;
    }
    
    
    public String GrabarArticulo(){
    conexion objmod=new conexion();
    String cad="insert into agregar_usuarios values('"+this.getNombre()+"','"+this.getApellido()+"','"+this.getCedula()+"','"+this.getCodigo()+"') ";

    return objmod.Ejecutar(cad);
    }
    
    public ArrayList<comedor>ListaArticulos(){
    ArrayList lista2=new ArrayList();
    try{
    conexion objmod=new conexion();
    ResultSet tabla=objmod.Listar("select * from agregar_usuarios");
    comedor objart;
        while(tabla.next()){
        objart=new comedor();
        objart.setNombre(tabla.getString("Nombre"));
        objart.setApellido(tabla.getString("Apellido"));
        objart.setCedula(tabla.getInt("Cedula"));
        objart.setCodigo(tabla.getInt("Codigo"));
        lista2.add(objart);
        }
    }catch(Exception e){
    javax.swing.JOptionPane.showMessageDialog(null,
    e.getMessage());
    }
    return lista2;
}
    
    public ArrayList<comedor>ListaFecha(){
    ArrayList lista1=new ArrayList();
    try{
    conexion objmod=new conexion();
    ResultSet tabla=objmod.Listar("select * from buscar");
    comedor objart;
        while(tabla.next()){
        objart=new comedor();
        objart.setBusquedaNombre(tabla.getString("BusquedaNombre"));
        objart.setBusquedaCodigo(tabla.getInt("BusquedaCodigo"));
        objart.setFecha(tabla.getString("Fecha"));
        lista1.add(objart);
        }
    }catch(Exception e){
    javax.swing.JOptionPane.showMessageDialog(null,
    e.getMessage());
    }
    return lista1;
    }
    
    public ArrayList<comedor>ListaAlimentos(){
    ArrayList lista=new ArrayList();
    try{
    conexion objmod=new conexion();
    ResultSet tabla=objmod.Listar("select * from alimentos");
    comedor objart;
        while(tabla.next()){
        objart=new comedor();
        objart.setAlimento(tabla.getString("Alimento"));
        objart.setCantidad(tabla.getInt("Cantidad"));
        lista.add(objart);
        }
    }catch(Exception e){
    javax.swing.JOptionPane.showMessageDialog(null,
    e.getMessage());
    }
    return lista;
    }

    
    //Get metodo
    public String getNombre() {
        return Nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public int getCedula() {
        return cedula;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getLunes() {
        return lunes;
    }

    public String getMartes() {
        return martes;
    }

    public String getMiercoles() {
        return miercoles;
    }

    public String getJueves() {
        return jueves;
    }

    public String getViernes() {
        return viernes;
    }

    public String getSemana() {
        return Semana;
    }

    public int getBusquedaCodigo() {
        return BusquedaCodigo;
    }

    public String getBusquedaNombre() {
        return BusquedaNombre;
    }

    public String getFecha() {
        return Fecha;
    }

    public String getAlimento() {
        return Alimento;
    }

    public int getCantidad() {
        return Cantidad;
    }
    
   
    
    //set metodo

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public void setLunes(String lunes) {
        this.lunes = lunes;
    }

    public void setMartes(String martes) {
        this.martes = martes;
    }

    public void setMiercoles(String miercoles) {
        this.miercoles = miercoles;
    }

    public void setJueves(String jueves) {
        this.jueves = jueves;
    }

    public void setViernes(String viernes) {
        this.viernes = viernes;
    }

    public void setSemana(String Semana) {
        this.Semana = Semana;
    }

    public void setBusquedaCodigo(int BusquedaCodigo) {
        this.BusquedaCodigo = BusquedaCodigo;
    }

    public void setBusquedaNombre(String BusquedaNombre) {
        this.BusquedaNombre = BusquedaNombre;
    }

    public void setFecha(String Fecha) {
        this.Fecha = Fecha;
    }

    public void setAlimento(String Alimento) {
        this.Alimento = Alimento;
    }

    public void setCantidad(int Cantidad) {
        this.Cantidad = Cantidad;
    }
    
    
    
    
    

    
   
}

