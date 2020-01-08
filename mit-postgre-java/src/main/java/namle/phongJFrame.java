/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package namle;

import java.sql.SQLException;
import namle.service.PhongService;
import java.sql.ResultSet;
import namle.helper.util;
import static namle.helper.util.buildTableModel;
import namle.model.Phong;
/**
 *
 * @author Nam Le
 */
public class phongJFrame extends javax.swing.JFrame {

    /**
     * Creates new form nhanvienJFrame
     */
    public phongJFrame() {
        initComponents();
        try {
            PhongService service = new PhongService();
            ResultSet rs = service.danhSachPhong();
            jTable.setModel(buildTableModel(rs));
        } catch (Exception ex) {
            util.showMessageBox(this, "Đã có lỗi xảy ra!" + ex.toString());
            
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel6 = new javax.swing.JLabel();
        btnHuybo = new javax.swing.JButton();
        btnLuu = new javax.swing.JButton();
        txtSdt = new javax.swing.JTextField();
        txtDiachi = new javax.swing.JTextField();
        txtTen = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        btnHuybo1 = new javax.swing.JButton();
        btnHuybo2 = new javax.swing.JButton();

        setTitle("Phòng");
        setAlwaysOnTop(true);
        setName("nhanvienjFrame"); // NOI18N
        setResizable(false);
        setType(java.awt.Window.Type.UTILITY);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setText("Phòng");

        btnHuybo.setText("Hủy bỏ");
        btnHuybo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnHuyboMouseClicked(evt);
            }
        });

        btnLuu.setText("Lưu lại");
        btnLuu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnLuuMouseClicked(evt);
            }
        });

        jLabel1.setText("Tên");

        jLabel3.setText("Địa chỉ");

        jTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable);

        jLabel4.setText("Số điện thoại");

        btnHuybo1.setText("Tất cả");
        btnHuybo1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnHuybo1MouseClicked(evt);
            }
        });
        btnHuybo1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHuybo1ActionPerformed(evt);
            }
        });

        btnHuybo2.setText("Lịch sử");
        btnHuybo2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnHuybo2MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnHuybo2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnHuybo1))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnLuu)
                                .addGap(18, 18, 18)
                                .addComponent(btnHuybo)
                                .addGap(458, 458, 458))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addComponent(jLabel1)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(txtTen, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                                        .addComponent(txtDiachi, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(33, 33, 33)
                                .addComponent(jLabel4)
                                .addGap(18, 18, 18)
                                .addComponent(txtSdt, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(btnHuybo1)
                    .addComponent(btnHuybo2))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtTen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtDiachi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(txtSdt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnHuybo)
                    .addComponent(btnLuu))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getAccessibleContext().setAccessibleName("nhanvienjFrame");

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnHuyboMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnHuyboMouseClicked
        closeForm();
    }//GEN-LAST:event_btnHuyboMouseClicked

    private void btnLuuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLuuMouseClicked
        long ma = util.getCurrentTimeMilliseconds();
        String ten = txtTen.getText();
        String dc = txtDiachi.getText();
        String sdt = txtSdt.getText();
        Phong p = new Phong(ma, ten, sdt, dc);
        if (ten.isEmpty() || dc.isEmpty() || sdt.isEmpty())
        util.showMessageBox(this, "Không được rỗng!");
        else {
            try {
                Phong insert = new PhongService().addNew(p);
                if (insert != null) {
                    util.showMessageBox(this, "Thêm Phòng hoàn tất");
                    closeForm();
                }
            } catch (SQLException ex) {
                util.showMessageBox(this, "Đã có lỗi xảy ra!" + ex.toString());
            } catch (Exception ex) {
                util.showMessageBox(this, "Đã có lỗi xảy ra!" + ex.toString());
            }
        }
    }//GEN-LAST:event_btnLuuMouseClicked

    private void btnHuybo1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnHuybo1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btnHuybo1MouseClicked

    private void btnHuybo2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnHuybo2MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btnHuybo2MouseClicked

    private void btnHuybo1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHuybo1ActionPerformed
        try {
            PhongService service = new PhongService();
            ResultSet rs = service.danhSachPhong();
            jTable.setModel(buildTableModel(rs));
        } catch (Exception ex) {
            util.showMessageBox(this, "Đã có lỗi xảy ra!" + ex.toString());
            
        }
    }//GEN-LAST:event_btnHuybo1ActionPerformed

    private void closeForm() {
        setVisible(false); 
        dispose(); 
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(phongJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(phongJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(phongJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(phongJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new phongJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnHuybo;
    private javax.swing.JButton btnHuybo1;
    private javax.swing.JButton btnHuybo2;
    private javax.swing.JButton btnLuu;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable;
    private javax.swing.JTextField txtDiachi;
    private javax.swing.JTextField txtSdt;
    private javax.swing.JTextField txtTen;
    // End of variables declaration//GEN-END:variables
}
