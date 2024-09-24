/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.listatarefas;



import javax.swing.*;
import java.awt.event.*;

public class ListaDeTarefas extends javax.swing.JFrame {

    private final DefaultListModel<Tarefa> modeloLista;

    public ListaDeTarefas() {
        initComponents();
        modeloLista = new DefaultListModel<>();
        listaTarefas.setModel(modeloLista);
    }

    @SuppressWarnings("unchecked")
    private void initComponents() {

        campoTarefa = new javax.swing.JTextField();
        botaoAdicionar = new javax.swing.JButton();
        botaoEditar = new javax.swing.JButton();
        botaoRemover = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        listaTarefas = new javax.swing.JList<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Lista de Tarefas");

        botaoAdicionar.setText("Adicionar Tarefa");
        botaoAdicionar.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoAdicionarActionPerformed(evt);
            }

            private void botaoAdicionarActionPerformed(ActionEvent evt) {
                throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
            }
        });

        botaoEditar.setText("Editar Tarefa");
        botaoEditar.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoEditarActionPerformed(evt);
            }

            private void botaoEditarActionPerformed(ActionEvent evt) {
                throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
            }
        });

        botaoRemover.setText("Remover Tarefa");
        botaoRemover.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoRemoverActionPerformed(evt);
            }

            private void botaoRemoverActionPerformed(ActionEvent evt) {
                throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
            }
        });

        jScrollPane1.setViewportView(listaTarefas);

        // Configurações do layout (gerado automaticamente pelo NetBeans)
        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(campoTarefa, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(botaoAdicionar)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(botaoEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(botaoRemover, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(campoTarefa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botaoAdicionar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botaoEditar)
                    .addComponent(botaoRemover))
                .addContainerGap(25, Short.MAX_VALUE))
        );

        pack();
    }
    // Funcionalidade de Adicionar Tarefa
    // Funcionalidade de Editar Tarefa
    // Funcionalidade de Remover Tarefa




    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> {
            new JFrame().setVisible(true);
        });
    }

    // Declaração de variáveis (gerada automaticamente pelo NetBeans)
    private javax.swing.JButton botaoAdicionar;
    private javax.swing.JButton botaoEditar;
    private javax.swing.JButton botaoRemover;
    private javax.swing.JTextField campoTarefa;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JList<Tarefa> listaTarefas;
}
