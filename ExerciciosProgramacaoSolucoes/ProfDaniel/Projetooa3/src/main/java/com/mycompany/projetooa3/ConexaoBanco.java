package com.mycompany.projetooa3;

import java.sql.Connection; 
import java.sql.DriverManager; 
public class ConexaoBanco { 
private static String host = "localhost";     
private static String porta = "3306";     
private static String db = "db_projetoa3";     
private static String usuario = "root";     
private static String senha = "projetoa3123"; 
    public static Connection obterConexao () throws Exception{ 
        String url = String.format("jdbc:mysql://%s:%s/%s?useTimezone=true&serverTimezone=UTC", 
    host, porta, db); 
        return DriverManager.getConnection(url, usuario, senha); 
    } 
} 
