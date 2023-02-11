package com.mycompany.eva1_3_constructores;

public class CuentaBancaria {
 
    private String numeroCuenta;
    private double saldo;
    private String nomCliente;
    
public CuentaBancaria(){
    numeroCuenta = "-----";
    saldo=0;
    nomCliente = "-----";
}
public CuentaBancaria(String nCuenta, double otroSaldo,String nCliente){
    numeroCuenta = nCuenta;
    saldo = otroSaldo;
    nomCliente = nCliente;
}
public String getNumeroCuenta(){
    return numeroCuenta;
}
public double getSaldo(){
    return saldo;
}
public String getNomCliente(){
    return nomCliente;
}
public void setNumeroCuenta(String valor){
    numeroCuenta= valor;
}
public void setSaldo (double valor){
    saldo= valor;
}
public void setNomCliente(String valor){
    nomCliente= valor;
}
}
