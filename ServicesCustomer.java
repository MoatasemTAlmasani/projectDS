import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.LinkedList;

public class ServicesCustomer extends JFrame {
    public ServicesCustomer() {
        initComponents();
    }
    private LinkedList<Client> clients=new LinkedList<>();
    int id2;
    Client client;
    //function to add new client
    public void addClientFrame(){
        class dialogAdd extends JFrame implements ActionListener {
            private JButton add1;
            private JButton exit1;

            private JTextField f_name,s_name,l_name,age,balance,balance_saudi,balance_Dolar,email,tel,id,username,password,gender,u;
            public dialogAdd(){
                setLayout(new FlowLayout());
                setVisible(true);
                setSize(300,400);
                id = new JTextField(15);
                add(new JLabel("number of new id:"));
                add(id);
//////////////////////////////////////////
                f_name = new JTextField(15);
                add(new JLabel("enter f-name:"));
                add(f_name);
/////////////////////////////////////////
                s_name = new JTextField(15);
                add(new JLabel("enter s-name:"));
                add(s_name);
/////////////////////////////////////////
                l_name = new JTextField(15);
                add(new JLabel("enter l-name:"));
                add(l_name);
/////////////////////////////////////////
                email = new JTextField(15);
                add(new JLabel("enter email:"));
                add(email);
/////////////////////////////////////////
                tel = new JTextField(15);
                add(new JLabel(" enter tel:"));
                add(tel);
/////////////////////////////////////////
                age = new JTextField(15);
                add(new JLabel("enter age:"));
                add(age);
/////////////////////////////////////////
                gender = new JTextField(15);
                add(new JLabel("enter gender:"));
                add(gender);
/////////////////////////////////////////

/////////////////////////////////////////
                balance = new JTextField(15);
                add(new JLabel("     balance      :"));
                add(balance);
/////////////////////////////////////////
                balance_saudi = new JTextField(15);
                add(new JLabel("     balance saudi:"));
                add(balance_saudi);
/////////////////////////////////////////
                balance_Dolar = new JTextField(15);
                add(new JLabel("    balance dolar :"));
                add(balance_Dolar);
/////////////////////////////////////////
                username = new JTextField(15);
                add(new JLabel("     username :"));
                add(username);
/////////////////////////////////////////
                password = new JTextField(15);
                add(new JLabel("     password :"));
                add(password);
///////////////////////////////////////
                add1=new JButton("OK");
                exit1=new JButton("exit");
                JPanel j = new JPanel();

                add(add1);
                getContentPane().add("South", j);
///////////////////////////////////////
                add1.addActionListener(this);
                exit1.addActionListener(this);

                String str1=String.valueOf(clients.get(clients.size()-1).getId()+1);
                id2=clients.get(clients.size()-1).getId()+1;
                id.setText(str1);
                System.out.println(clients.size());
                System.out.println(clients.get(0).getId());
            }
            @Override
            public void actionPerformed(ActionEvent e) {
                if (e.getSource()==add1)
                {
                    client = new Client(id2,f_name.getText(),s_name.getText(),l_name.getText(),Integer.parseInt(age.getText()),email.getText(),gender.getText(),Integer.parseInt(tel.getText()),Double.parseDouble(balance.getText()),Double.parseDouble(balance_saudi.getText()),Double.parseDouble(balance_Dolar.getText()),username.getText(),Integer.parseInt(password.getText()));
                    clients.addFirst(client);
                    saveChanges();
                    dispose();
                }
////////////////////////////////////////////
                else if(e.getSource()==exit1)
                {
                    dispose();
                }
////////////////////////////////////////////
            }
        }
        new dialogAdd();
    }
    //updeate
    public void deposit(){

        class depositClient extends JFrame {
            public depositClient() {
                initComponents();
            }

            /**
             * This method is called from within the constructor to initialize the form.
             * WARNING: Do NOT modify this code. The content of this method is always
             * regenerated by the Form Editor.
             */
            @SuppressWarnings("unchecked")
            // <editor-fold defaultstate="collapsed" desc="Generated Code">
            private void initComponents() {

                jPanel1 = new JPanel();
                jLabel1 = new JLabel();
                idCl = new JTextField();
                ok = new JButton();
                cencel = new JButton();
                jLabel2 = new JLabel();
                deposis = new JTextField();

                setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
                setLocation(new Point(300, 300));

                jLabel1.setHorizontalAlignment(SwingConstants.CENTER);
                jLabel1.setText("ادخل رقم العميل المراد ايداع لحسابه");

                ok.setText("OK");
                ok.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent evt) {
                        okActionPerformed(evt);
                    }
                });

                cencel.setText("CENCEL");
                cencel.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent evt) {
                        cencelActionPerformed(evt);
                    }
                });

                jLabel2.setHorizontalAlignment(SwingConstants.CENTER);
                jLabel2.setText("ادخل المبلغ المراد ايداعه");

                GroupLayout jPanel1Layout = new GroupLayout(jPanel1);
                jPanel1.setLayout(jPanel1Layout);
                jPanel1Layout.setHorizontalGroup(
                        jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(123, 123, 123)
                                        .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                                                .addComponent(idCl, GroupLayout.PREFERRED_SIZE, 71, GroupLayout.PREFERRED_SIZE)
                                                .addComponent(ok, GroupLayout.PREFERRED_SIZE, 55, GroupLayout.PREFERRED_SIZE)
                                                .addComponent(deposis, GroupLayout.PREFERRED_SIZE, 71, GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                                .addGroup(jPanel1Layout.createSequentialGroup()
                                                        .addGap(65, 65, 65)
                                                        .addComponent(cencel))
                                                .addGroup(jPanel1Layout.createSequentialGroup()
                                                        .addGap(29, 29, 29)
                                                        .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                                                .addComponent(jLabel2, GroupLayout.PREFERRED_SIZE, 175, GroupLayout.PREFERRED_SIZE)
                                                                .addComponent(jLabel1, GroupLayout.PREFERRED_SIZE, 175, GroupLayout.PREFERRED_SIZE))))
                                        .addContainerGap(77, Short.MAX_VALUE))
                );
                jPanel1Layout.setVerticalGroup(
                        jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                .addGroup(GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addContainerGap()
                                        .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                                .addComponent(jLabel1, GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE)
                                                .addComponent(idCl, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 7, Short.MAX_VALUE)
                                        .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                                .addComponent(jLabel2, GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE)
                                                .addComponent(deposis, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                        .addGap(27, 27, 27)
                                        .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                                .addComponent(ok)
                                                .addComponent(cencel))
                                        .addContainerGap())
                );

                GroupLayout layout = new GroupLayout(getContentPane());
                getContentPane().setLayout(layout);
                layout.setHorizontalGroup(
                        layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                .addGroup(GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(jPanel1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addContainerGap())
                );
                layout.setVerticalGroup(
                        layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                        .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jPanel1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                );

                pack();
            }// </editor-fold>

            private void okActionPerformed(ActionEvent evt) {
                // TODO add your handling code here:
                if (evt.getSource()==ok){


                    int d=  Integer.parseInt(idCl.getText());
                    int d1=  Integer.parseInt(deposis.getText());
                    int a=0;
                    for (Client c:clients)
                    {
                        if (d==c.getId())
                        {
                            c.account.deposit(d1);
                            --a;
                        }
                    }
                    if (a==-1){JOptionPane.showMessageDialog(null,"تم الايداع بنجاح ");dispose();}
                    else if (a>=0){JOptionPane.showMessageDialog(null,"fail number of id not found ");}


                }
            }

            private void cencelActionPerformed(ActionEvent evt) {
                // TODO add your handling code here:
                dispose();
            }


            // Variables declaration - do not modify
            private JButton cencel;
            private JTextField deposis;
            private JTextField idCl;
            private JLabel jLabel1;
            private JLabel jLabel2;
            private JPanel jPanel1;
            private JButton ok;
            // End of variables declaration
        }

        new depositClient().setVisible(true);
    }
    //remove
    public void removeClient(){
    class removeClientFrame extends JFrame {
            public removeClientFrame() {
                initComponents();
            }
            private void initComponents() {
                jPanel1 = new JPanel();
                jLabel1 = new JLabel();
                removeClin = new JTextField();
                ok = new JButton();
                cencel = new JButton();

                setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
                setLocation(new Point(300, 300));

                jLabel1.setHorizontalAlignment(SwingConstants.CENTER);
                jLabel1.setText("ادخل رقم العميل المراد حذف حسابه");

                ok.setText("OK");
                ok.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent evt) {
                        okActionPerformed(evt);
                    }
                });

                cencel.setText("CENCEL");
                cencel.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent evt) {
                        cencelActionPerformed(evt);
                    }
                });

                GroupLayout jPanel1Layout = new GroupLayout(jPanel1);
                jPanel1.setLayout(jPanel1Layout);
                jPanel1Layout.setHorizontalGroup(
                        jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(36, 36, 36)
                                        .addComponent(removeClin, GroupLayout.PREFERRED_SIZE, 57, GroupLayout.PREFERRED_SIZE)
                                        .addGap(26, 26, 26)
                                        .addComponent(jLabel1, GroupLayout.PREFERRED_SIZE, 175, GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                                        .addComponent(ok, GroupLayout.PREFERRED_SIZE, 55, GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(cencel)
                                        .addContainerGap())
                );
                jPanel1Layout.setVerticalGroup(
                        jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                .addGroup(GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addContainerGap(40, Short.MAX_VALUE)
                                        .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                                .addComponent(jLabel1, GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE)
                                                .addComponent(cencel)
                                                .addComponent(ok)
                                                .addComponent(removeClin, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                        .addGap(48, 48, 48))
                );

                GroupLayout layout = new GroupLayout(getContentPane());
                getContentPane().setLayout(layout);
                layout.setHorizontalGroup(
                        layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                .addGroup(GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(jPanel1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addContainerGap())
                );
                layout.setVerticalGroup(
                        layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                        .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jPanel1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                );

                pack();
            }// </editor-fold>

            private void okActionPerformed(ActionEvent evt) {
                // TODO add your handling code here:
                if (evt.getSource()==ok){
                    {

                        int z= Integer.parseInt(removeClin.getText());
                        int a=0;
                        for (int i = 0; i <clients.size() ; i++) {
                            {
                                if (clients.get(i).getId()==z)
                                {
                                    clients.remove(i);
                                    dispose();
                                    --a;
                                }
                            }
                        }
                        if(a==-1) {JOptionPane.showMessageDialog(null,"has been deleted");}
                        else if(a>=0) {JOptionPane.showMessageDialog(null,"not deleted (number of id not found");

                        }
                    }
                }}

            private void cencelActionPerformed(ActionEvent evt) {
                // TODO add your handling code here:
                if (evt.getSource()==cencel){
                    dispose();
                }
            }

            private JButton cencel;
            private JLabel jLabel1;
            private JPanel jPanel1;
            private JButton ok;
            private JTextField removeClin;

        }

        new removeClientFrame().setVisible(true);
    }
    //update
    public void withdraw(){


        class depositClient extends JFrame {
            public depositClient() {
                initComponents();
            }

            /**
             * This method is called from within the constructor to initialize the form.
             * WARNING: Do NOT modify this code. The content of this method is always
             * regenerated by the Form Editor.
             */
            @SuppressWarnings("unchecked")
            // <editor-fold defaultstate="collapsed" desc="Generated Code">
            private void initComponents() {

                jPanel1 = new JPanel();
                jLabel1 = new JLabel();
                idCl = new JTextField();
                ok = new JButton();
                cencel = new JButton();
                jLabel2 = new JLabel();
                deposis = new JTextField();

                setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
                setLocation(new Point(300, 300));

                jLabel1.setHorizontalAlignment(SwingConstants.CENTER);
                jLabel1.setText("ادخل رقم العميل المراد السحب من حسابه");

                ok.setText("OK");
                ok.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent evt) {
                        okActionPerformed(evt);
                    }
                });

                cencel.setText("CENCEL");
                cencel.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent evt) {
                        cencelActionPerformed(evt);
                    }
                });

                jLabel2.setHorizontalAlignment(SwingConstants.CENTER);
                jLabel2.setText("ادخل المبلغ المراد السحب من رصيده");

                GroupLayout jPanel1Layout = new GroupLayout(jPanel1);
                jPanel1.setLayout(jPanel1Layout);
                jPanel1Layout.setHorizontalGroup(
                        jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(123, 123, 123)
                                        .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                                                .addComponent(idCl, GroupLayout.PREFERRED_SIZE, 71, GroupLayout.PREFERRED_SIZE)
                                                .addComponent(ok, GroupLayout.PREFERRED_SIZE, 55, GroupLayout.PREFERRED_SIZE)
                                                .addComponent(deposis, GroupLayout.PREFERRED_SIZE, 71, GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                                .addGroup(jPanel1Layout.createSequentialGroup()
                                                        .addGap(65, 65, 65)
                                                        .addComponent(cencel))
                                                .addGroup(jPanel1Layout.createSequentialGroup()
                                                        .addGap(29, 29, 29)
                                                        .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                                                .addComponent(jLabel2, GroupLayout.PREFERRED_SIZE, 175, GroupLayout.PREFERRED_SIZE)
                                                                .addComponent(jLabel1, GroupLayout.PREFERRED_SIZE, 175, GroupLayout.PREFERRED_SIZE))))
                                        .addContainerGap(77, Short.MAX_VALUE))
                );
                jPanel1Layout.setVerticalGroup(
                        jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                .addGroup(GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addContainerGap()
                                        .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                                .addComponent(jLabel1, GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE)
                                                .addComponent(idCl, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 7, Short.MAX_VALUE)
                                        .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                                .addComponent(jLabel2, GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE)
                                                .addComponent(deposis, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                        .addGap(27, 27, 27)
                                        .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                                .addComponent(ok)
                                                .addComponent(cencel))
                                        .addContainerGap())
                );

                GroupLayout layout = new GroupLayout(getContentPane());
                getContentPane().setLayout(layout);
                layout.setHorizontalGroup(
                        layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                .addGroup(GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(jPanel1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addContainerGap())
                );
                layout.setVerticalGroup(
                        layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                        .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jPanel1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                );

                pack();
            }// </editor-fold>

            private void okActionPerformed(ActionEvent evt) {
                // TODO add your handling code here:
                if (evt.getSource()==ok){
                    int d=  Integer.parseInt(idCl.getText());
                    int d1=  Integer.parseInt(deposis.getText());
                    int a=0;
                    int a1=0;
                    for (Client c:clients){
                        if (d==c.getId())
                        {
                            if (c.account.getBalance()>=d1)
                            {
                                c.account.withdraw(d1);
                                JOptionPane.showMessageDialog(null," تم السحب ");
                            }
                            else if (c.account.getBalance()<d1)
                            {
                                --a;
                            }
                        }
                        else if (d!=c.getId()){a1--;}
                    }

                    if (a<0){JOptionPane.showMessageDialog(null," الرصيد غير كافي ");}
                   // else if (a1==-1){JOptionPane.showMessageDialog(null," id  not  found ");}


                }
            }

            private void cencelActionPerformed(ActionEvent evt) {
                // TODO add your handling code here:
                dispose();
            }


            // Variables declaration - do not modify
            private JButton cencel;
            private JTextField deposis;
            private JTextField idCl;
            private JLabel jLabel1;
            private JLabel jLabel2;
            private JPanel jPanel1;
            private JButton ok;
            // End of variables declaration
        }

        new depositClient().setVisible(true);
    }
    //update
    public void transform(){


        class transform extends JFrame {

            /**
             * Creates new form removeClientFrame
             */
            public transform() {
                initComponents();
            }

            /**
             * This method is called from within the constructor to initialize the form.
             * WARNING: Do NOT modify this code. The content of this method is always
             * regenerated by the Form Editor.
             */
            @SuppressWarnings("unchecked")
            // <editor-fold defaultstate="collapsed" desc="Generated Code">
            private void initComponents() {

                jPanel1 = new JPanel();
                jLabel1 = new JLabel();
                idmor = new JTextField();
                ok = new JButton();
                cencel = new JButton();
                jLabel2 = new JLabel();
                idmos = new JTextField();
                transform = new JTextField();
                jLabel3 = new JLabel();

                setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
                setLocation(new Point(300, 300));

                jLabel1.setHorizontalAlignment(SwingConstants.CENTER);
                jLabel1.setText("ادخل رقم العميل المراد الايداع من حسابه");

                ok.setText("OK");
                ok.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent evt) {
                        okActionPerformed(evt);
                    }
                });

                cencel.setText("CENCEL");
                cencel.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent evt) {
                        cencelActionPerformed(evt);
                    }
                });

                jLabel2.setHorizontalAlignment(SwingConstants.CENTER);
                jLabel2.setText("ادخل رقم العميل الارسال لحسابه");

                jLabel3.setHorizontalAlignment(SwingConstants.CENTER);
                jLabel3.setText("ادخل الملبغ المراد ارساله");

                GroupLayout jPanel1Layout = new GroupLayout(jPanel1);
                jPanel1.setLayout(jPanel1Layout);
                jPanel1Layout.setHorizontalGroup(
                        jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                                .addGroup(jPanel1Layout.createSequentialGroup()
                                                        .addGap(139, 139, 139)
                                                        .addComponent(ok, GroupLayout.PREFERRED_SIZE, 55, GroupLayout.PREFERRED_SIZE)
                                                        .addGap(70, 70, 70)
                                                        .addComponent(cencel))
                                                .addGroup(jPanel1Layout.createSequentialGroup()
                                                        .addGap(78, 78, 78)
                                                        .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                                                .addGroup(jPanel1Layout.createSequentialGroup()
                                                                        .addComponent(idmor, GroupLayout.PREFERRED_SIZE, 71, GroupLayout.PREFERRED_SIZE)
                                                                        .addGap(13, 13, 13)
                                                                        .addComponent(jLabel1, GroupLayout.PREFERRED_SIZE, 253, GroupLayout.PREFERRED_SIZE))
                                                                .addGroup(jPanel1Layout.createSequentialGroup()
                                                                        .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                                                                .addComponent(idmos, GroupLayout.PREFERRED_SIZE, 71, GroupLayout.PREFERRED_SIZE)
                                                                                .addComponent(transform, GroupLayout.PREFERRED_SIZE, 71, GroupLayout.PREFERRED_SIZE))
                                                                        .addGap(67, 67, 67)
                                                                        .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                                                                .addComponent(jLabel3, GroupLayout.PREFERRED_SIZE, 175, GroupLayout.PREFERRED_SIZE)
                                                                                .addComponent(jLabel2, GroupLayout.PREFERRED_SIZE, 175, GroupLayout.PREFERRED_SIZE))))))
                                        .addContainerGap(25, Short.MAX_VALUE))
                );
                jPanel1Layout.setVerticalGroup(
                        jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                .addGroup(GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                                .addComponent(jLabel1, GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE)
                                                .addComponent(idmor, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
                                        .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                                .addComponent(jLabel2, GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE)
                                                .addComponent(idmos, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                                .addComponent(transform, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jLabel3, GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE))
                                        .addGap(11, 11, 11)
                                        .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                                .addComponent(ok)
                                                .addComponent(cencel))
                                        .addContainerGap())
                );

                GroupLayout layout = new GroupLayout(getContentPane());
                getContentPane().setLayout(layout);
                layout.setHorizontalGroup(
                        layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                .addGroup(GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(jPanel1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addContainerGap())
                );
                layout.setVerticalGroup(
                        layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                        .addContainerGap()
                                        .addComponent(jPanel1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addContainerGap())
                );

                pack();
            }// </editor-fold>

            private void okActionPerformed(ActionEvent evt) {
                // TODO add your handling code here:
                if (evt.getSource()==ok)
                {
                    int idmors=Integer.parseInt(idmor.getText());
                    int idmost=Integer.parseInt(idmos.getText());
                    int cost=Integer.parseInt(transform.getText());
                    int a1=0;
                    int a2=0;
                    int a3=0;
                    for (Client c:clients)
                    {
                        if (idmors==c.getId())
                        {

                            for (Client c1:clients)
                            {
                                if (idmost==c1.getId())
                                {

                                    if (cost<c.account.getBalance())
                                    {

                                        c.account.withdraw(cost);
                                        c1.account.deposit(cost);
                                        --a3;

                                    }
                                    else ++a3;
                                }
                                else ++a2;
                            }
                        }
                        else ++a1;
                    }
                    if (a3==-1){JOptionPane.showMessageDialog(null,"تم التحويل بنجاح");}
                    if (a2>0 & a1==-1){JOptionPane.showMessageDialog(null,"رقم اللمستلم خاطئ او غير موجود");}
                   // if (a1>0 & a3==-1){JOptionPane.showMessageDialog(null,"رقم المرسل خاطئ");}
                    if (a3==1 &a2>0&a1>0){JOptionPane.showMessageDialog(null,"الرصيد غير كافي");}


                }
            }

            private void cencelActionPerformed(ActionEvent evt) {
                // TODO add your handling code here:
                if (evt.getSource()==cencel)dispose();
            }



            // Variables declaration - do not modify
            private JButton cencel;
            private JTextField idmor;
            private JTextField idmos;
            private JLabel jLabel1;
            private JLabel jLabel2;
            private JLabel jLabel3;
            private JPanel jPanel1;
            private JButton ok;
            private JTextField transform;
            // End of variables declaration
        }
        new transform().setVisible(true);

    }
    //update
    public void updateClient()
    {

        class update extends JFrame {

            public update() {
                initComponents();
            }

            /**
             * This method is called from within the constructor to initialize the form.
             * WARNING: Do NOT modify this code. The content of this method is always
             * regenerated by the Form Editor.
             */
            @SuppressWarnings("unchecked")
            // <editor-fold defaultstate="collapsed" desc="Generated Code">
            private void initComponents() {

                jPanel1 = new JPanel();
                gend = new JButton();
                us = new JButton();
                passs = new JButton();
                jLabel1 = new JLabel();
                fName = new JButton();
                sName = new JButton();
                Lname = new JButton();
                agee = new JButton();
                emailllll = new JButton();
                telll = new JButton();
                numId = new JTextField();
                jLabel2 = new JLabel();

                setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
                setBackground(new Color(255, 204, 102));

                gend.setText("الجنس");
                gend.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent evt) {
                        gendActionPerformed(evt);
                    }
                });

                us.setText("اسم المستخدم");
                us.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent evt) {
                        usActionPerformed(evt);
                    }
                });

                passs.setText("كلمة المرور");
                passs.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent evt) {
                        passsActionPerformed(evt);
                    }
                });

                jLabel1.setFont(new Font("Tahoma", 1, 24)); // NOI18N
                jLabel1.setText("للتعديل ادخل رقم العميل ثم انقر على احد الايقونات");

                fName.setText("الاسم الاول");
                fName.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent evt) {
                        fNameActionPerformed(evt);
                    }
                });

                sName.setText("الاسم الثاني");
                sName.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent evt) {
                        sNameActionPerformed(evt);
                    }
                });

                Lname.setText("الاسم الاخير");
                Lname.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent evt) {
                        LnameActionPerformed(evt);
                    }
                });

                agee.setText("العمر");
                agee.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent evt) {
                        ageeActionPerformed(evt);
                    }
                });

                emailllll.setText("الايميل");
                emailllll.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent evt) {
                        emailllllActionPerformed(evt);
                    }
                });

                telll.setText("رقم الهاتف");
                telll.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent evt) {
                        telllActionPerformed(evt);
                    }
                });

                numId.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent evt) {
                        numIdActionPerformed(evt);
                    }
                });

                jLabel2.setText("ادخل رقم العميل");

                GroupLayout jPanel1Layout = new GroupLayout(jPanel1);
                jPanel1.setLayout(jPanel1Layout);
                jPanel1Layout.setHorizontalGroup(
                        jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                                .addGroup(jPanel1Layout.createSequentialGroup()
                                                        .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                                                .addGroup(jPanel1Layout.createSequentialGroup()
                                                                        .addGap(42, 42, 42)
                                                                        .addComponent(numId, GroupLayout.PREFERRED_SIZE, 56, GroupLayout.PREFERRED_SIZE)
                                                                        .addGap(22, 22, 22))
                                                                .addGroup(GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                                                        .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                        .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                                                                .addComponent(telll, GroupLayout.PREFERRED_SIZE, 84, GroupLayout.PREFERRED_SIZE)
                                                                                .addComponent(fName))
                                                                        .addGap(11, 11, 11)))
                                                        .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                                                .addGroup(jPanel1Layout.createSequentialGroup()
                                                                        .addComponent(jLabel2, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                                                .addGroup(GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                                                        .addGap(27, 27, 27)
                                                                        .addComponent(sName)
                                                                        .addGap(18, 18, 18)
                                                                        .addComponent(Lname)
                                                                        .addGap(32, 32, 32)
                                                                        .addComponent(emailllll)
                                                                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                                                .addGroup(GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                                        .addGap(148, 148, 148)
                                                        .addComponent(gend, GroupLayout.PREFERRED_SIZE, 97, GroupLayout.PREFERRED_SIZE)
                                                        .addGap(48, 48, 48)
                                                        .addComponent(us)
                                                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                        .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                                                .addComponent(agee)
                                                .addComponent(passs, GroupLayout.PREFERRED_SIZE, 109, GroupLayout.PREFERRED_SIZE))
                                        .addGap(75, 75, 75))
                                .addGroup(GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addComponent(jLabel1)
                                        .addGap(62, 62, 62))
                );
                jPanel1Layout.setVerticalGroup(
                        jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addContainerGap()
                                        .addComponent(jLabel1, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE)
                                        .addGap(36, 36, 36)
                                        .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                                .addComponent(numId, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jLabel2))
                                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                                        .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                                .addComponent(fName)
                                                .addComponent(sName)
                                                .addComponent(Lname)
                                                .addComponent(emailllll)
                                                .addComponent(agee))
                                        .addGap(18, 18, 18)
                                        .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                                .addComponent(telll)
                                                .addComponent(gend)
                                                .addComponent(us)
                                                .addComponent(passs))
                                        .addContainerGap())
                );

                GroupLayout layout = new GroupLayout(getContentPane());
                getContentPane().setLayout(layout);
                layout.setHorizontalGroup(
                        layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                .addComponent(jPanel1, GroupLayout.PREFERRED_SIZE, 608, GroupLayout.PREFERRED_SIZE)
                );
                layout.setVerticalGroup(
                        layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                        .addComponent(jPanel1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 11, Short.MAX_VALUE))
                );

                pack();
            }// </editor-fold>

            private void fNameActionPerformed(ActionEvent evt) {
                // TODO add your handling code here:
                int a=0;
                int b=0;

                if (evt.getSource()==fName)
                {
                    for (Client c:clients)
                    {
                        if (Integer.parseInt(numId.getText())==c.getId())
                        {
                            String s=  JOptionPane.showInputDialog("ادخل الاسم الاول الجديد");
                            c.setFirst_name(s);
                            a++;
                        }
                    }
                }

                if (a==1){
                    JOptionPane.showMessageDialog(null,"تم التغيير بنجاح ");
                }
                else JOptionPane.showMessageDialog(null,"الرقم المدخل خاطئ او غير موجود ");
            }

            private void passsActionPerformed(ActionEvent evt) {
                int a=0;
                int b=0;
                int p;
                if (evt.getSource()==passs){
                    {
                        for (Client c:clients)
                        {
                            if (Integer.parseInt(numId.getText())==c.getId()){
                                p =Integer.parseInt(JOptionPane.showInputDialog("ادخل password الجديد"));
                                {
                                    c.account.setPassword(p);
                                    a++;
                                }
                            }
                            else --a;

                        }
                    }
                }
                if (b==1){
                    JOptionPane.showMessageDialog(null,"تم التغيير بنجاح ");
                }
                else JOptionPane.showMessageDialog(null,"الرقم المدخل خاطئ او غير موجود ");

            }
            private void usActionPerformed(ActionEvent evt) {
                int a=0;

                if (evt.getSource()==us)
                {
                    for (Client c:clients)
                    {
                        if (Integer.parseInt(numId.getText())==c.getId())
                        {
                            String s=  JOptionPane.showInputDialog("ادخل الاسم الاول الجديد");
                            c.account.setUsername(s);
                            a++;
                        }
                        else --a;
                        if(a==1){JOptionPane.showMessageDialog(null,"تم التغيير بنجاح ");}
                    }
                    if (a<0){JOptionPane.showMessageDialog(null,"الرقم المدخل خاطئ او غير موجود ");}
                }
                // TODO add your handling code here:
            }
            private void gendActionPerformed(ActionEvent evt) {
                int a=0;
                int b=0;
                if (evt.getSource()==gend)
                {
                    for (Client c:clients)
                    {
                        if (Integer.parseInt(numId.getText())==c.getId())
                        {
                            String s=  JOptionPane.showInputDialog("ادخل الجنس الجديد");
                            c.setGender(s);
                           b++;
                        }
                        else --a;
                    }
                }
                if (b==1){
                    JOptionPane.showMessageDialog(null,"تم التغيير بنجاح ");
                }
                else JOptionPane.showMessageDialog(null,"الرقم المدخل خاطئ او غير موجود ");

            }

            private void telllActionPerformed(ActionEvent evt) {
                int a=0;
                int b=0;
                int p;
                if (evt.getSource()==telll){
                    {
                        for (Client c:clients)
                        {
                            if (Integer.parseInt(numId.getText())==c.getId()){
                                p =Integer.parseInt(JOptionPane.showInputDialog("ادخل رقم الهاتف الجديد"));
                                if (p>=15)
                                {
                                    c.setTelephone_Number(p);
                                    b++;
                                }
                                else JOptionPane.showMessageDialog(null,"خطأ");
                            }
                            else --a;
                        }
                    }

                }
                if (b==1){
                    JOptionPane.showMessageDialog(null,"تم التغيير بنجاح ");
                }
                else JOptionPane.showMessageDialog(null,"الرقم المدخل خاطئ او غير موجود ");
            }
            private void ageeActionPerformed(ActionEvent evt) {
                int a=0;
                int b=0;
                int p;
                if (evt.getSource()==agee){
                    {
                        System.out.println("sssss");
                        for (Client c:clients)
                        {
                            if (Integer.parseInt(numId.getText())==c.getId()){

                                p =Integer.parseInt(JOptionPane.showInputDialog("ادخل العمر الجديد"));
                                    c.setAge(p);
                                    b++;
                            }

                            else --a;

                        }
                    }

                }
                if (b==1){
                    JOptionPane.showMessageDialog(null,"تم التغيير بنجاح ");
                }
                else JOptionPane.showMessageDialog(null,"الرقم المدخل خاطئ او غير موجود ");
            }


            private void emailllllActionPerformed(ActionEvent evt) {
                int a=0;

                if (evt.getSource()==emailllll)
                {
                    System.out.println("dsjfbik");
                    for (Client c:clients)
                    {
                        if (Integer.parseInt(numId.getText())==c.getId())
                        {
                            String s=  JOptionPane.showInputDialog("ادخل الاسم الاول الجديد");
                            c.setEmail(s);
                            a++;
                        }
                        else --a;
                        if(a==1){JOptionPane.showMessageDialog(null,"تم التغيير بنجاح ");}
                    }
                    if (a<0){JOptionPane.showMessageDialog(null,"الرقم المدخل خاطئ او غير موجود ");}
                }
            }

            private void LnameActionPerformed(ActionEvent evt) {
                int a=0;
                int b=0;
                if (evt.getSource()==Lname){
                    for (Client c:clients)
                    {
                        if (Integer.parseInt(numId.getText())==c.getId()){
                            c.setLast_Name(JOptionPane.showInputDialog("ادخل الاسم الثاني الجديد"));
                            b++;
                        }

                    }

                }
                if (b==1){
                    JOptionPane.showMessageDialog(null,"تم التغيير بنجاح ");
                }
                else JOptionPane.showMessageDialog(null,"الرقم المدخل خاطئ او غير موجود ");
            }

            private void sNameActionPerformed(ActionEvent evt) {
                int a=0;
                int b=0;
                if (evt.getSource()==sName){
                    for (Client c:clients)
                    {
                        if (Integer.parseInt(numId.getText())==c.getId()){
                            c.setSecond_Name(JOptionPane.showInputDialog("ادخل الاسم الثاني الجديد"));
                            b++;
                        }

                    }

                }
                if (b==1){
                    JOptionPane.showMessageDialog(null,"تم التغيير بنجاح ");
                }
                else JOptionPane.showMessageDialog(null,"الرقم المدخل خاطئ او غير موجود ");
            }
            private void  numIdActionPerformed(ActionEvent evt) {
            }


            // Variables declaration - do not modify
            private JButton Lname;
            private JButton agee;
            private JButton emailllll;
            private JButton fName;
            private JButton gend;
            private JLabel jLabel1;
            private JLabel jLabel2;
            private JPanel jPanel1;
            private JTextField numId;
            private JButton passs;
            private JButton sName;
            private JButton telll;
            private JButton us;
            // End of variables declaration
        }
        new update().setVisible(true);


    }
    private void save(){

        {
            try {
                Statement s1;
                PreparedStatement s,s2;
                Connection conn = null;
                conn = DriverManager.getConnection("jdbc:ucanaccess://D:\\studentsystem.accdb");
                s=conn.prepareStatement("delete from c ");
                s.execute();
                for(Client c:clients)
                {
                    s2 = conn.prepareStatement("insert into c (id,c1,c2,c3,ag,email,gender,phone,balance,b_s,b_d,un,pass) values("+c.getId()+",'" + c.getFirst_name() + "','" + c.getSecond_Name() + "','" + c.getLast_Name() + "'," + c.getAge() + ",'" + c.getEmail() + "','" + c.getGender() + "'," + c.getTelephone_Number() + "," + c.account.getBalance()+ "," + c.account.getBalance_Saudi() + "," + c.account.getBalance_Dolar()+ ",'" + c.account.getUsername() + "'," + c.account.getPassword() + ")");
                    s2.execute();
                }
            }
            catch(SQLException e1) {e1.printStackTrace();}







        }
    }
    public void saveChanges(){
        class ForConfirmation extends JFrame {
            public ForConfirmation() {initComponents();}
            @SuppressWarnings("unchecked")
            private void initComponents() {
                jLabel1 = new JLabel();
                jButton1 = new JButton();
                jButton2 = new JButton();

                setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);

                jLabel1.setFont(new Font("Tahoma", 1, 14)); // NOI18N
                jLabel1.setText("للتأكيد اضغط على موافق");

                jButton1.setText("موافق");
                jButton1.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent evt) {
                        jButton1ActionPerformed(evt);
                    }
                });

                jButton2.setText("الغاء");
                jButton2.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent evt) {
                        jButton2ActionPerformed(evt);
                    }
                });

                GroupLayout layout = new GroupLayout(getContentPane());
                getContentPane().setLayout(layout);
                layout.setHorizontalGroup(
                        layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                        .addGap(62, 62, 62)
                                        .addComponent(jLabel1)
                                        .addContainerGap(74, Short.MAX_VALUE))
                                .addGroup(layout.createSequentialGroup()
                                        .addGap(38, 38, 38)
                                        .addComponent(jButton1)
                                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jButton2)
                                        .addGap(47, 47, 47))
                );
                layout.setVerticalGroup(
                        layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                        .addGap(33, 33, 33)
                                        .addComponent(jLabel1, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 60, Short.MAX_VALUE)
                                        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                                .addComponent(jButton1)
                                                .addComponent(jButton2))
                                        .addContainerGap())
                );

                pack();
            }// </editor-fold>
            private void jButton1ActionPerformed(ActionEvent evt) {
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
                        }dispose();
                    }
                    JOptionPane.showMessageDialog(null,"تم حفظ التغيرات");
                }

            }
            private void jButton2ActionPerformed(ActionEvent evt) {
                // TODO add your handling code here:
                if (evt.getSource()==jButton2)dispose();
            }
            private JButton jButton1;
            private JButton jButton2;
            private JLabel jLabel1;
        }
        new ForConfirmation().setVisible(true);
    }
    private void clearActionPerformed(ActionEvent evt) {
        // TODO add your handling code here:
        DefaultTableModel model=(DefaultTableModel) jTable1.getModel();
        jTable1=new JTable(model);
        model.setRowCount(0);
    }
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
    private void initComponents() {

        report = new JButton();
        jMenu1 = new JMenu();
        jPanel1 = new JPanel();
        jScrollPane1 = new JScrollPane();
        jTable1 = new JTable();
        search = new JButton();
        displayAll = new JButton();
        searchText = new JTextField();
        deposit = new JButton();
        withdraw = new JButton();
        transform = new JButton();
        exit = new JButton();
        jLabel1 = new JLabel();
        jLabel2 = new JLabel();
        addClient = new JButton();
        removeClient = new JButton();
        updateClient = new JButton();
        dateText = new JTextField();
        timeText = new JTextField();
        date = new JLabel();
        t = new JLabel();
        Day = new JLabel();
        dayText = new JTextField();
        clear = new JButton();
        jMenuBar1 = new JMenuBar();
        jMenu2 = new JMenu();
        jMenu3 = new JMenu();
        java.util.Date date2=new java.util.Date();
        SimpleDateFormat date1=new SimpleDateFormat("yyyy-mm-dd");


        dateText.setText(date1.format(date2));

        report.setText("REPORTS");
        report.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                reportActionPerformed(evt);
            }
        });

        jMenu1.setText("jMenu1");

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setBackground(new Color(153, 153, 255));

        jPanel1.setBackground(new Color(51, 153, 255));

        jTable1.setModel(new DefaultTableModel(
                new Object [][] {

                },
                new String [] {
                        "ID", "FIRST-NAME", "SECOND-NAME", "LAST-NAME", "AGE","EMAIL" , "GENDER", "TELEPHONE", "BALANCE", "BALANCE-S", "BALANCE-D", "USERNAME", "PASSWORD"
                }
        ));
        jScrollPane1.setViewportView(jTable1);

        search.setText("SEARCH");
        search.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                searchActionPerformed(evt);
            }
        });

        displayAll.setText("DISPLAY ALL");
        displayAll.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                displayAllActionPerformed(evt);
            }
        });

        searchText.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                searchTextActionPerformed(evt);
            }
        });

        deposit.setText("DEPOSIT");
        deposit.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                depositActionPerformed(evt);
            }
        });

        withdraw.setText("WITHDRAW");
        withdraw.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                withdrawActionPerformed(evt);
            }
        });

        transform.setText("TRANSFORM");
        transform.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                transformActionPerformed(evt);
            }
        });

        exit.setText("SAVE");
        exit.setSize(10,10);
        exit.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                exitActionPerformed(evt);
            }
        });

        jLabel1.setFont(new Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new Color(51, 51, 255));
        jLabel1.setText("الخدمات المالية ");

        jLabel2.setFont(new Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setText("خدمات العملاء");

        addClient.setText("ADD CLIENT");
        addClient.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                addClientActionPerformed(evt);
            }
        });

        removeClient.setText("REMOVE CLIENT");
        removeClient.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                removeClientActionPerformed(evt);
            }
        });

        updateClient.setText("UPDATE CLIENT");
        updateClient.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                updateClientActionPerformed(evt);
            }
        });

        dateText.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                dateTextActionPerformed(evt);
            }
        });

        timeText.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                timeTextActionPerformed(evt);
            }
        });

        date.setText("Date");

        t.setText("Time:");

        Day.setText("Day:");

        clear.setText("CLEAR");
        clear.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                clearActionPerformed(evt);
            }
        });

        GroupLayout jPanel1Layout = new GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addGroup(GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                                .addContainerGap()
                                                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                                        .addComponent(jScrollPane1, GroupLayout.Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 874, Short.MAX_VALUE)
                                                        .addGroup(GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                                                .addComponent(date)
                                                                .addGap(18, 18, 18)
                                                                .addComponent(dateText, GroupLayout.PREFERRED_SIZE, 127, GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(Day)
                                                                .addGap(18, 18, 18)
                                                                .addComponent(dayText, GroupLayout.PREFERRED_SIZE, 123, GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                                                .addComponent(t)
                                                                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                                                .addComponent(timeText, GroupLayout.PREFERRED_SIZE, 65, GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                .addComponent(search)
                                                                .addGap(18, 18, 18)
                                                                .addComponent(searchText, GroupLayout.PREFERRED_SIZE, 248, GroupLayout.PREFERRED_SIZE))))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(340, 340, 340)
                                                .addComponent(jLabel2)
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(clear)))
                                .addContainerGap())
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(192, 192, 192)
                                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(141, 141, 141)
                                                .addComponent(jLabel1, GroupLayout.PREFERRED_SIZE, 192, GroupLayout.PREFERRED_SIZE)
                                                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                                                        .addGroup(GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                                                .addGap(74, 74, 74)
                                                                .addComponent(deposit)
                                                                .addGap(29, 29, 29)
                                                                .addComponent(withdraw)
                                                                .addGap(18, 18, 18)
                                                                .addComponent(transform))
                                                        .addGroup(GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                                                .addComponent(displayAll)
                                                                .addGap(18, 18, 18)
                                                                .addComponent(addClient, GroupLayout.PREFERRED_SIZE, 107, GroupLayout.PREFERRED_SIZE)
                                                                .addGap(18, 18, 18)
                                                                .addComponent(removeClient)
                                                                .addGap(18, 18, 18)
                                                                .addComponent(updateClient)))
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(exit, GroupLayout.PREFERRED_SIZE, 65, GroupLayout.PREFERRED_SIZE)
                                                .addGap(83, 83, 83))))
        );
        jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(42, 42, 42)
                                                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                                        .addComponent(searchText, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(search)
                                                        .addComponent(dateText, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(timeText, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(date)
                                                        .addComponent(t)
                                                        .addComponent(Day)
                                                        .addComponent(dayText, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                                .addGap(18, 18, 18)
                                                .addComponent(jScrollPane1, GroupLayout.DEFAULT_SIZE, 135, Short.MAX_VALUE)
                                                .addGap(18, 18, 18)
                                                .addComponent(jLabel2, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(clear, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE)))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(displayAll)
                                        .addComponent(addClient)
                                        .addComponent(removeClient)
                                        .addComponent(updateClient))
                                .addGap(27, 27, 27)
                                .addComponent(jLabel1, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE)
                                .addGap(33, 33, 33)
                                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(deposit)
                                        .addComponent(withdraw)
                                        .addComponent(transform)
                                        .addComponent(exit))
                                .addGap(18, 18, 18))
        );

        jMenu2.setText("About Us");
        jMenuBar1.add(jMenu2);

        jMenu3.setText("INFO");
        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jPanel1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jPanel1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addContainerGap())
        );

        pack();
    }// </editor-fold>
    private void searchTextActionPerformed(ActionEvent evt) {
        // TODO add your handling code here:
    }
    private void depositActionPerformed(ActionEvent evt) {
        // TODO add your handling code here:
        this.deposit();
    }
    private void withdrawActionPerformed(ActionEvent evt) {
        // TODO add your handling code here:
        this.withdraw();
    }
    private void transformActionPerformed(ActionEvent evt) {
        // TODO add your handling code here:
        if (evt.getSource()==transform)
            this.transform();
    }
    private void exitActionPerformed(ActionEvent evt) {
        if (evt.getSource()==exit){
            saveChanges();
        }
    }
    private void addClientActionPerformed(ActionEvent evt) {
        // TODO add your handling code here:
        this.addClientFrame();
    }
    private void removeClientActionPerformed(ActionEvent evt) {
        // TODO add your handling code here:
        this.removeClient();
    }
    private void updateClientActionPerformed(ActionEvent evt) {
        // TODO add your handling code here:
        this.updateClient();
    }
    private void dateTextActionPerformed(ActionEvent evt) {
        // TODO add your handling code here:
    }
    private void timeTextActionPerformed(ActionEvent evt) {
        // TODO add your handling code here:
    }
    private void reportActionPerformed(ActionEvent evt) {
        // TODO add your handling code here:
    }
    private void displayAllActionPerformed(ActionEvent evt) {
        if (evt.getSource()==displayAll){

            DefaultTableModel model=(DefaultTableModel) jTable1.getModel();
            jTable1=new JTable(model);
            model.setRowCount(0);
            for (Client c:clients){
                Object[] row={c.getId(),c.getFirst_name(),c.getSecond_Name(),c.getLast_Name(),c.getAge(),c.getEmail(),c.getGender(),c.getTelephone_Number(),c.account.getBalance(),c.account.getBalance_Saudi(),c.account.getBalance_Dolar(),c.account.getUsername(),c.account.getPassword()};
                model.addRow(row);
            }

        }
    }
    private void searchActionPerformed(ActionEvent evt) {
        // TODO add your handling code here:
        if (evt.getSource() == search) {
            System.out.println("isuhc");
            DefaultTableModel model=(DefaultTableModel) jTable1.getModel();
            jTable1=new JTable(model);
            model.setRowCount(0);
            int a= Integer.parseInt(searchText.getText());
            try {
                Statement s1;
                Connection conn = null;
                conn = DriverManager.getConnection("jdbc:ucanaccess://D:\\studentsystem.accdb");
                s1 = (Statement) conn.createStatement();
                ResultSet rs = s1.executeQuery("select * from c where id ="+a+"  ");

                while (rs.next()) {
                    Object[] row={rs.getInt("id"),rs.getString("c1"),rs.getString("c2"),rs.getString("c3"),rs.getInt("ag"),rs.getString("email"),rs.getString("gender"),rs.getInt("phone"),rs.getInt("balance"),rs.getInt("b_s"),rs.getInt("b_d"),rs.getString("un"),rs.getInt("pass")};
                    model.addRow(row);
                }

            } catch (SQLException e1) {
                e1.printStackTrace();
            }

        }
    }
    public static void main(String args[]) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ServicesCustomer().setVisible(true);
                System.out.println();
            }

        });
    }

    // Variables declaration - do not modify
    private JLabel Day;
    private JButton addClient;
    private JButton clear;
    private JLabel date;
    private JTextField dateText;
    private JTextField dayText;
    private JButton deposit;
    private JButton displayAll;
    private JButton exit;
    private JLabel jLabel1;
    private JLabel jLabel2;
    private JMenu jMenu1;
    private JMenu jMenu2;
    private JMenu jMenu3;
    private JMenuBar jMenuBar1;
    private JPanel jPanel1;
    private JScrollPane jScrollPane1;
    private JTable jTable1;
    private JButton removeClient;
    private JButton report;
    private JButton search;
    private JTextField searchText;
    private JLabel t;
    private JTextField timeText;
    private JButton transform;
    private JButton updateClient;
    private JButton withdraw;
}
