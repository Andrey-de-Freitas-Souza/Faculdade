package com.mycompany.projetooa3;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;


public class DAO {
    public void cadastrarUsuario (Usuario usuario) throws Exception{
        String sql = "INSERT INTO tb_usuario (nome_usuario, cpf_usuario, senha_usuario) VALUES (?, ?, ?);";
        try (Connection conexao = ConexaoBanco.obterConexao(); 
                PreparedStatement ps = conexao.prepareStatement(sql)){
            ps.setString(1, usuario.getNome()); 
            ps.setString(2, usuario.getCPF()); 
            ps.setString(3, usuario.getSenha()); 
            ps.execute(); 
        } 
    }
        
    public void loginUsuario (Usuario usuario) throws Exception{
        String sql = "SELECT *FROM tb_usuario WHERE cpf_usuario = ? AND senha_usuario = ?;";
        try (Connection conexao = ConexaoBanco.obterConexao(); 
                PreparedStatement ps = conexao.prepareStatement(sql)){
            ps.setString(1, usuario.getCPF()); 
            ps.setString(2, usuario.getSenha()); 
            ps.execute(); 
             MenuUsuario menuUsuario = new MenuUsuario();
             menuUsuario.setVisible(true);
             TelaLogin.FecharTela();
        } 
    } 
    
    }
