import javax.swing.*;
import java.sql.*;
import java.util.ArrayList;
import java.util.LinkedList;


class Loginin extends JFrame {

   // private DoublyLinkedList<Client> clients=new DoublyLinkedList<>();
    LinkedList<Client>clients=new LinkedList<>();
    Client client;
    int id;


    //login in to Customers's GUI
    private void loginnActionPerformed(java.awt.event.ActionEvent evt) {
       if (evt.getSource()==loginn){
           int a=0;
           for (Client c:clients){
              if (Integer.parseInt(usn.getText())==c.getId() & Integer.parseInt(psw.getText())==c.account.getPassword()){a++;id=c.getId();}
               }
           if (a==1){JOptionPane.showMessageDialog(null,"correct");
               dispose();
           clien();
           }
           else {JOptionPane.showMessageDialog(null,"error");}
       }
    }
    //exit from cuurent GUI
    private void cencActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
        if (evt.getSource()==cenc){
            dispose();
        }
    }
   //run Main GUI
    public static void main(String args[]) {
      {
          new Loginin().setVisible(true);
            }
        }



    //other GUIs
    public void clien(){
        class AsClient extends javax.swing.JFrame {

            private ArrayList<Client> clients=new ArrayList<>();
            Client client;
            {
                try {
                    Statement s1;
                    Connection conn = null;
                    conn = DriverManager.getConnection("jdbc:ucanaccess://D:\\studentsystem.accdb");
                    s1 = (Statement) conn.createStatement();
                    ResultSet rs = s1.executeQuery("select * from c");
                    while (rs.next()) {
                        client = new Client(rs.getInt("id"), rs.getString("c1"), rs.getString("c2"), rs.getString("c3"), rs.getInt("ag"), rs.getString("email"), rs.getString("gender"), rs.getInt("phone"), rs.getInt("balance"), rs.getInt("b_s"), rs.getInt("b_d"), rs.getString("un"), rs.getInt("pass"));
                        clients.add(client);
                    }
                } catch (SQLException e1) {
                    e1.printStackTrace();
                }
            }
            public AsClient(){initComponents();}
            @SuppressWarnings("unchecked")

            // <editor-fold defaultstate="collapsed" desc="Generated Code">
            private void initComponents() {

                jPanel1 = new javax.swing.JPanel();
                jLabel1 = new javax.swing.JLabel();
                fulname = new javax.swing.JLabel();
                jLabel2 = new javax.swing.JLabel();
                bal = new javax.swing.JLabel();
                jButton1 = new javax.swing.JButton();
                jButton2 = new javax.swing.JButton();

                setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
                setLocation(new java.awt.Point(250, 300));

                jPanel1.setBackground(new java.awt.Color(204, 204, 255));

                jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
                jLabel1.setText("مرحبا بك ");
                for (Client c:clients){
                    if (id==c.getId()){
                        fulname.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
                        fulname.setText(c.getFullName());
                        bal.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
                        String s=String.valueOf(c.account.getBalance());
                        bal.setText(s);

                    }

                }


                jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
                jLabel2.setText("رصيدك هو");

                jButton1.setText("refresh");
                jButton1.addActionListener(new java.awt.event.ActionListener() {
                    public void actionPerformed(java.awt.event.ActionEvent evt) {
                        jButton1ActionPerformed(evt);
                    }
                });

                jButton2.setText("TRANSFORM");
                jButton2.addActionListener(new java.awt.event.ActionListener() {
                    public void actionPerformed(java.awt.event.ActionEvent evt) {
                        jButton2ActionPerformed(evt);
                        transform();
                    }
                });

                javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
                jPanel1.setLayout(jPanel1Layout);
                jPanel1Layout.setHorizontalGroup(
                        jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addContainerGap()
                                        .addComponent(bal, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(jPanel1Layout.createSequentialGroup()
                                                        .addComponent(jLabel2)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(fulname, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(jLabel1)
                                                        .addGap(19, 19, 19))
                                                .addGroup(jPanel1Layout.createSequentialGroup()
                                                        .addComponent(jButton1)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 69, Short.MAX_VALUE)
                                                        .addComponent(jButton2)
                                                        .addGap(57, 57, 57))))
                );
                jPanel1Layout.setVerticalGroup(
                        jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addContainerGap()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(fulname, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)
                                                .addComponent(bal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGap(28, 28, 28)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                .addComponent(jButton2)
                                                .addComponent(jButton1))
                                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                );

                javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
                getContentPane().setLayout(layout);
                layout.setHorizontalGroup(
                        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addContainerGap()
                                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addContainerGap())
                );
                layout.setVerticalGroup(
                        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                );

                pack();
            }// </editor-fold>

            private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {
                if (evt.getSource()==jButton2){

                }

            }
            private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {
                if (evt.getSource()==jButton1){
                    dispose();
                    clien();
                }

            }
            // Variables declaration - do not modify
            private javax.swing.JLabel bal;
            private javax.swing.JLabel fulname;
            private javax.swing.JButton jButton1;
            private javax.swing.JButton jButton2;
            private javax.swing.JLabel jLabel1;
            private javax.swing.JLabel jLabel2;
            private javax.swing.JPanel jPanel1;
            // End of variables declaration
        }
        new AsClient().setVisible(true);
    }
    public void transform(){
        class removeClientFrame extends javax.swing.JFrame {
            public removeClientFrame() {
                initComponents();
            }
            @SuppressWarnings("unchecked")
            private void initComponents() {

                jPanel1 = new javax.swing.JPanel();
                ok = new javax.swing.JButton();
                cencel = new javax.swing.JButton();
                jLabel2 = new javax.swing.JLabel();
                idmos = new javax.swing.JTextField();
                transform = new javax.swing.JTextField();
                jLabel3 = new javax.swing.JLabel();

                setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
                setLocation(new java.awt.Point(300, 300));

                ok.setText("OK");
                ok.addActionListener(new java.awt.event.ActionListener() {
                    public void actionPerformed(java.awt.event.ActionEvent evt) {
                        okActionPerformed(evt);
                    }
                });

                cencel.setText("CENCEL");
                cencel.addActionListener(new java.awt.event.ActionListener() {
                    public void actionPerformed(java.awt.event.ActionEvent evt) {
                        cencelActionPerformed(evt);
                    }
                });

                jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
                jLabel2.setText("ادخل رقم العميل المراد الارسال لحسابه");

                jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
                jLabel3.setText("ادخل الملبغ المراد ارساله");

                javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
                jPanel1.setLayout(jPanel1Layout);
                jPanel1Layout.setHorizontalGroup(
                        jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(jPanel1Layout.createSequentialGroup()
                                                        .addGap(139, 139, 139)
                                                        .addComponent(ok, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGap(70, 70, 70)
                                                        .addComponent(cencel))
                                                .addGroup(jPanel1Layout.createSequentialGroup()
                                                        .addGap(78, 78, 78)
                                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                .addComponent(idmos, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addComponent(transform, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addGap(67, 67, 67)
                                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                        .addContainerGap(49, Short.MAX_VALUE))
                );
                jPanel1Layout.setVerticalGroup(
                        jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(idmos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(18, 18, 18)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(transform, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                .addComponent(ok)
                                                .addComponent(cencel))
                                        .addContainerGap())
                );

                javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
                getContentPane().setLayout(layout);
                layout.setHorizontalGroup(
                        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addContainerGap())
                );
                layout.setVerticalGroup(
                        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                        .addContainerGap()
                                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addContainerGap())
                );

                pack();
            }// </editor-fold>

            private void okActionPerformed(java.awt.event.ActionEvent evt){

                if (evt.getSource()==ok){
                    int z=0;int a=0;
                    if (Integer.parseInt(idmos.getText())<=0){
                        JOptionPane.showMessageDialog(null,"رقم العميل خاطئ خاطئ");
                    }

                    else if (Double.parseDouble(transform.getText())<=0){
                        JOptionPane.showMessageDialog(null,"المبلغ المدخل خاطئ");
                    }

                    else {

                    for (int i = 0; i < clients.size(); i++)
                    {
                        if (clients.get(i).getId()==id)
                        {
                            if (clients.get(i).account.getBalance()>=Double.parseDouble(transform.getText())){z++;}
                            else z--;
                        }
                    }


                    if (z==1)
                    {
                        for (Client c:clients)
                        {
                            if(Integer.parseInt(idmos.getText())==c.getId())
                            {
                                c.account.deposit(Double.parseDouble(transform.getText()));
                                a++;
                            }
                        }
                    }
                   else{
                        JOptionPane.showMessageDialog(null,"الرصيد غير كافي");

                    }

                    if (a==1){
                        for (int i = 0; i < clients.size(); i++)
                        {
                            if (clients.get(i).getId()==id)
                            {
                                clients.get(i).account.transform(Double.parseDouble(transform.getText()));
                                saveChanges();
                                dispose();
                            }
                        }
                    }
                    else JOptionPane.showMessageDialog(null,"لم يتم الحفظ بنجاح ");
                    dispose();
                    }
                }
            }

            private void cencelActionPerformed(java.awt.event.ActionEvent evt) {
                // TODO add your handling code here:
                if (evt.getSource()==cencel){
                    dispose();
                }
            }

            // Variables declaration - do not modify
            private javax.swing.JButton cencel;
            private javax.swing.JTextField idmos;
            private javax.swing.JLabel jLabel2;
            private javax.swing.JLabel jLabel3;
            private javax.swing.JPanel jPanel1;
            private javax.swing.JButton ok;
            private javax.swing.JTextField transform;
            // End of variables declaration
        }
        new removeClientFrame().setVisible(true);
    }
    public void saveChanges(){
        class ForConfirmation extends javax.swing.JFrame {
            public ForConfirmation() {initComponents();}
            @SuppressWarnings("unchecked")
            private void initComponents() {
                jLabel1 = new javax.swing.JLabel();
                jButton1 = new javax.swing.JButton();
                jButton2 = new javax.swing.JButton();

                setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);

                jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
                jLabel1.setText("للتأكيد اضغط على موافق");

                jButton1.setText("موافق");
                jButton1.addActionListener(new java.awt.event.ActionListener() {
                    public void actionPerformed(java.awt.event.ActionEvent evt) {
                        jButton1ActionPerformed(evt);
                    }
                });

                jButton2.setText("الغاء");
                jButton2.addActionListener(new java.awt.event.ActionListener() {
                    public void actionPerformed(java.awt.event.ActionEvent evt) {
                        jButton2ActionPerformed(evt);
                    }
                });

                javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
                getContentPane().setLayout(layout);
                layout.setHorizontalGroup(
                        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                        .addGap(62, 62, 62)
                                        .addComponent(jLabel1)
                                        .addContainerGap(74, Short.MAX_VALUE))
                                .addGroup(layout.createSequentialGroup()
                                        .addGap(38, 38, 38)
                                        .addComponent(jButton1)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jButton2)
                                        .addGap(47, 47, 47))
                );
                layout.setVerticalGroup(
                        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                        .addGap(33, 33, 33)
                                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 60, Short.MAX_VALUE)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                .addComponent(jButton1)
                                                .addComponent(jButton2))
                                        .addContainerGap())
                );

                pack();
            }// </editor-fold>
            private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {
                if (evt.getSource()==jButton1){


                    {
                        try {
                            Statement s1;
                            PreparedStatement s, s2;
                            Connection conn = null;
                            conn = DriverManager.getConnection("jdbc:ucanaccess://D:\\studentsystem.accdb");
                            s = conn.prepareStatement("delete from c ");
                            s.execute();
                            for (Client c : clients) {
                                s2 = conn.prepareStatement("insert into c (id,c1,c2,c3,ag,email,gender,phone,balance,b_s,b_d,un,pass) values("+c.getId()+",'" + c.getFirst_name() + "','" + c.getSecond_Name() + "','" + c.getLast_Name() + "'," + c.getAge() + ",'" + c.getEmail() + "','" + c.getGender() + "'," + c.getTelephone_Number() + "," + c.account.getBalance() + "," + c.account.getBalance_Saudi() + "," + c.account.getBalance_Dolar() + ",'" + c.account.getUsername() + "'," + c.account.getPassword() + ")");
                                s2.execute();
                            }

                        } catch (SQLException e1) {
                            e1.printStackTrace();
                        }
                        dispose();
                    }
                    JOptionPane.showMessageDialog(null,"تم حفظ التغيرات");
                }


            }
            private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {
                // TODO add your handling code here:
                if (evt.getSource()==jButton2)dispose();
            }
            private javax.swing.JButton jButton1;
            private javax.swing.JButton jButton2;
            private javax.swing.JLabel jLabel1;
        }
        new ForConfirmation().setVisible(true);
    }


    // Variables declaration - do not modify
    private JButton asEmp;
    private JButton cenc;
    private JLabel jLabel1;
    private JLabel jLabel2;
    private JLabel jLabel3;
    private JLabel jLabel4;
    private JLabel jLabel5;
    private JLabel jLabel6;
    private JLabel jLabel7;
    private JPanel jPanel1;
    private JPanel jPanel2;
    private JButton loginn;
    private JTextField psw;
    private JTextField usn;
    // End of variables declaration


    {
        try {
            Statement s1;
            Connection conn = null;
            conn = DriverManager.getConnection("jdbc:ucanaccess://D:\\studentsystem.accdb");
            s1 = (Statement) conn.createStatement();
            ResultSet rs = s1.executeQuery("select * from c");
            while (rs.next()) {
                client = new Client(rs.getInt("id"), rs.getString("c1"), rs.getString("c2"), rs.getString("c3"), rs.getInt("ag"), rs.getString("email"), rs.getString("gender"), rs.getInt("phone"), rs.getInt("balance"), rs.getInt("b_s"), rs.getInt("b_d"), rs.getString("un"), rs.getInt("pass"));
                clients.addFirst(client);
            }
        } catch (SQLException e1) {
            e1.printStackTrace();
        }
    }

    public Loginin() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">
    private void initComponents() {

        jPanel1 = new JPanel();
        jPanel2 = new JPanel();
        jLabel1 = new JLabel();
        jLabel2 = new JLabel();
        jLabel3 = new JLabel();
        usn = new JTextField();
        psw = new JTextField();
        loginn = new JButton();
        cenc = new JButton();
        asEmp = new JButton();
        jLabel4 = new JLabel();
        jLabel5 = new JLabel();
        jLabel6 = new JLabel();
        jLabel7 = new JLabel();

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.SW_RESIZE_CURSOR));
        setLocation(new java.awt.Point(300, 250));

        jPanel1.setBackground(new java.awt.Color(204, 255, 204));
        jPanel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jPanel2.setBackground(new java.awt.Color(255, 204, 204));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("مرحبا بك في خدمة البنك المصرفي");

        GroupLayout jPanel2Layout = new GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
                jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(67, 67, 67)
                                .addComponent(jLabel1)
                                .addContainerGap(69, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
                jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel1, GroupLayout.PREFERRED_SIZE, 43, GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setText("ID :");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setText("Password :");

        loginn.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        loginn.setText("LOGIN");
        loginn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginnActionPerformed(evt);
            }
        });

        cenc.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        cenc.setText("CENCEL");
        cenc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cencActionPerformed(evt);
            }
        });


        jLabel4.setText("للاشتراك في الخدمة التواصل على الارقام التالية");

        jLabel5.setText("774519161");

        jLabel6.setText("771357631");

        jLabel7.setText("773068179");

        GroupLayout jPanel1Layout = new GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.TRAILING, false)
                                                .addGroup(jPanel1Layout.createSequentialGroup()
                                                        .addContainerGap()
                                                        .addComponent(jLabel5)
                                                        .addGap(18, 18, 18)
                                                        .addComponent(jLabel6)
                                                        .addGap(29, 29, 29)
                                                        .addComponent(jLabel7)
                                                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(asEmp))
                                                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                                .addGap(20, 20, 20)
                                                                .addComponent(jPanel2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                                .addGap(85, 85, 85)
                                                                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                                                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                                                                        .addComponent(jLabel2, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                                        .addComponent(jLabel3, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                                                                .addGap(18, 18, 18)
                                                                                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                                                                        .addComponent(usn, GroupLayout.PREFERRED_SIZE, 162, GroupLayout.PREFERRED_SIZE)
                                                                                        .addComponent(psw, GroupLayout.PREFERRED_SIZE, 162, GroupLayout.PREFERRED_SIZE)))
                                                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                                                .addGap(49, 49, 49)
                                                                                .addComponent(loginn, GroupLayout.PREFERRED_SIZE, 72, GroupLayout.PREFERRED_SIZE)
                                                                                .addGap(64, 64, 64)
                                                                                .addComponent(cenc))))))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addContainerGap()
                                                .addComponent(jLabel4)))
                                .addContainerGap(25, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jPanel2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addGap(41, 41, 41)
                                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel2)
                                        .addComponent(usn, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                .addGap(27, 27, 27)
                                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel3)
                                        .addComponent(psw, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(loginn)
                                        .addComponent(cenc))
                                .addGap(18, 18, 18)
                                .addComponent(jLabel4)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 9, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addComponent(asEmp)
                                        .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                                .addComponent(jLabel5)
                                                .addComponent(jLabel6)
                                                .addComponent(jLabel7)))
                                .addContainerGap())
        );

        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel1, GroupLayout.Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>
}
