// import java.sql.*; // 1) import packages
//
//public class DemoJDBC {
//    public static void main(String[] args) throws Exception {
//
//        /**
//         * 1) Import packages(import java.sql.*)
//         * 2) Load drivers(comes from jar file)
//         * 3) Register Drivers
//         * 4) Create Connection
//         * 5) Create Statement
//         * 6) Execute Statement
//         * 7) Close connection
//         */
//
//
//        // 2) load drives and 3) Register Drivers : This is step is optional
//
//
//          Class.forName("org.postgresql.Driver"); // gives exception
//
//
//        // 4) Create Connection
//        String url="jdbc:postgresql://localhost:5432/demo";
//        String user="postgres";
//        String pass="Vinayaka@502";
//        Connection con= DriverManager.getConnection(url,user,pass); // gives exception
//        System.out.println("Connection is Established");
//
//
//
//     //   5) Creating Statement
//
//        Statement st=con.createStatement();
//
//        // 6) Execute Statement
//
//        String sql="insert into students values ('papa',5,98)";
//        System.out.println(st.executeQuery(sql));
//
//        // 7) Connection close
//
//        System.out.println("Connection is Terminated");
//        con.close();
//
//
//
//    }
//}





//// Method 2:
//
//
//import java.sql.*; // 1) import packages
//
//public class DemoJDBC {
//    public static void main(String[] args) throws Exception {
//
//        /**
//         * 1) Import packages(import java.sql.*)
//         * 2) Load drivers(comes from jar file)
//         * 3) Register Drivers
//         * 4) Create Connection
//         * 5) Create Statement
//         * 6) Execute Statement
//         * 7) Close connection
//         */
//
//
//        // 2) load drives and 3) Register Drivers : This is step is optional
//
//
//        Class.forName("org.postgresql.Driver"); // gives exception
//
//
//        // 4) Create Connection
//        String url="jdbc:postgresql://localhost:5432/demo";
//        String user="postgres";
//        String pass="Vinayaka@502";
//        Connection con= DriverManager.getConnection(url,user,pass); // gives exception
//        System.out.println("Connection is Established");
//
//
//
//        //   5) Creating Statement
//
//        Statement st=con.createStatement();
//
//
//        // 6) Execute Statement
//
//        // a) step 1:
//
////        String sql="select * from students where marks>=95";
////
////        ResultSet rs= st.executeQuery(sql);
////        System.out.println(rs.next()); // next() tells its has a data in the database: so it returns true
//
//
//
//        // B) Step 2;
//        // What if the data is not there in the database and we trying to fetch and using next() to check the data
//
//        String sql="select * from students where marks>=100"; // this is false data so it will return false
//        ResultSet rs= st.executeQuery(sql);
//
//
////        System.out.println(rs);  // this will give you not answer because the pointer will point before the first row data
//        // example if in atable we have name and msrks column and we trying to fetech name and gave query to fetch data but it points before the name
//System.out.println(rs.next()); //  so we need to use next() so that it will point to the next data
//        // if the query eneted that data is not there in the database it will give false which means no data
//
//
//        // 7) Connection close
//
//
//        con.close();
//        System.out.println("Connection is Terminated");
//
//
//
//    }
//}







//// Method 3: printing one value
//
//
//import java.sql.*; // 1) import packages
//
//public class DemoJDBC {
//    public static void main(String[] args) throws Exception {
//
//        /**
//         * 1) Import packages(import java.sql.*)
//         * 2) Load drivers(comes from jar file)
//         * 3) Register Drivers
//         * 4) Create Connection
//         * 5) Create Statement
//         * 6) Execute Statement
//         * 7) Close connection
//         */
//
//
//        // 2) load drives and 3) Register Drivers : This is step is optional
//
//
//        Class.forName("org.postgresql.Driver"); // gives exception
//
//
//        // 4) Create Connection
//        String url="jdbc:postgresql://localhost:5432/demo";
//        String user="postgres";
//        String pass="Vinayaka@502";
//        Connection con= DriverManager.getConnection(url,user,pass); // gives exception
//        System.out.println("Connection is Established");
//
//
//
//        //   5) Creating Statement
//
//        Statement st=con.createStatement();
//
//
//        // 6) Execute Statement
//
//        String sql="select * from students where marks>=90";
//        ResultSet rs= st.executeQuery(sql);
//
//// by default the pointer will be before the first row(Before name coloumn)
//// so we need to use rs.next() it will go to the first record like that
//
//        rs.next();
////        System.out.println(rs.next()); // undo and run
//
//
//// c) Step 3: instead of printing true or false i want to print the real data so we use getString
//
//        String name=rs.getString("name");
//        System.out.println("Name of the Student is :"+name);
//
//
//
//        // 7) Connection close
//
//
//        con.close();
//        System.out.println("Connection is Terminated");
//
//
//
//    }
//}








//// Method 4: Fetching all records (like read operation ) : we are using executeQuery.
//
//
//import java.sql.*; // 1) import packages
//
//public class DemoJDBC {
//    public static void main(String[] args) throws Exception {
//
//        /**
//         * 1) Import packages(import java.sql.*)
//         * 2) Load drivers(comes from jar file)
//         * 3) Register Drivers
//         * 4) Create Connection
//         * 5) Create Statement
//         * 6) Execute Statement
//         * 7) Close connection
//         */
//
//
//        // 2) load drives and 3) Register Drivers : This is step is optional
//
//
//        Class.forName("org.postgresql.Driver"); // gives exception
//
//
//        // 4) Create Connection
//        String url="jdbc:postgresql://localhost:5432/demo";
//        String user="postgres";
//        String pass="Vinayaka@502";
//        Connection con= DriverManager.getConnection(url,user,pass); // gives exception
//        System.out.println("Connection is Established");
//
//
//
//        //   5) Creating Statement
//
//        Statement st=con.createStatement();
//
//
//        // 6) Execute Statement
//
//        String sql="select * from students";
//        ResultSet rs= st.executeQuery(sql); // execute query is to used to get Data
//       // if we want to use automated way
//        // we use rs.next(); it gives two things
//        // 1) it will check do we have next row data if it is yes it will points to next row
//        // 2) it makes sure it will shift to the next row
//
////
//        while(rs.next()){
//            System.out.print(rs.getString(1) +"-");
//            System.out.print(rs.getString(2)+"-");
//            System.out.print(rs.getString(3)+"-");
//            System.out.println();
//        }
//
//        // But if we have huge databse were we dont known how many coloums are present here we can fully automate it as follows
//
////        while (rs.next()) // this will count the number of rows {
////            // the inner loop will count for the coloumns
////
////
////        }// try this its incomplete
//
//
//
//
//        // 7) Connection close
//        con.close();
//        System.out.println("Connection is Terminated");
//
//
//
//    }
//}










//// Method 5: in previous we able to get data but we dont know how we can alter data
//// Curd Operation : insert query
//
//
//import java.sql.*; // 1) import packages
//
//public class DemoJDBC {
//    public static void main(String[] args) throws Exception {
//
//        /**
//         * 1) Import packages(import java.sql.*)
//         * 2) Load drivers(comes from jar file)
//         * 3) Register Drivers
//         * 4) Create Connection
//         * 5) Create Statement
//         * 6) Execute Statement
//         * 7) Close connection
//         */
//
//
//        // 2) load drives and 3) Register Drivers : This is step is optional
//
//
//        Class.forName("org.postgresql.Driver"); // gives exception
//
//
//        // 4) Create Connection
//        String url="jdbc:postgresql://localhost:5432/demo";
//        String user="postgres";
//        String pass="Vinayaka@502";
//        Connection con= DriverManager.getConnection(url,user,pass); // gives exception
//        System.out.println("Connection is Established");
//
//
//        //   5) Creating Statement
//
//        Statement st=con.createStatement();
//
//
//     // to insert
//        String sql="insert into students values('Nicklaus',6,98)";
////        String sql="select * from students";
//
//// when we want to execute to return so we use execute : it returns boolean  value
//
//        Boolean status=st.execute(sql); // this will return boolean value.
//        // If we use select query then if we use execute it returns to true .it means its displayed all the values.
//        // But for insert , delete  and update query it returns to false it means it worked well and updated the database.
//        System.out.println(status);
//
//
//        // 7) Connection close
//        con.close();
//        System.out.println("Connection is Terminated");
//
//
//
//    }
//}









//// Method 6:
//// Curd Operation : update query
//
//
//import java.sql.*; // 1) import packages
//
//public class DemoJDBC {
//    public static void main(String[] args) throws Exception {
//
//        /**
//         * 1) Import packages(import java.sql.*)
//         * 2) Load drivers(comes from jar file)
//         * 3) Register Drivers
//         * 4) Create Connection
//         * 5) Create Statement
//         * 6) Execute Statement
//         * 7) Close connection
//         */
//
//
//        // 2) load drives and 3) Register Drivers : This is step is optional
//
//
//        Class.forName("org.postgresql.Driver"); // gives exception
//
//
//        // 4) Create Connection
//        String url="jdbc:postgresql://localhost:5432/demo";
//        String user="postgres";
//        String pass="Vinayaka@502";
//        Connection con= DriverManager.getConnection(url,user,pass); // gives exception
//        System.out.println("Connection is Established");
//
//
//        //   5) Creating Statement
//
//        Statement st=con.createStatement();
//
//
//        // to insert
//        String sql="update students set name='Fizg' where rollno=5" ;
//
//
//
//        Boolean status=st.execute(sql); // this will return boolean value.
//        // If we use select query then if we use execute it returns to true .it means its displayed all the values.
//        // But for insert , delete and update query it returns to false it means it worked well and updated the database.
//        System.out.println(status);
//
//
//        // 7) Connection close
//        con.close();
//        System.out.println("Connection is Terminated");
//
//
//
//    }
//}







//// Method 7:
//// Curd Operation : delete query
//
//
//import java.sql.*; // 1) import packages
//
//public class DemoJDBC {
//    public static void main(String[] args) throws Exception {
//
//        /**
//         * 1) Import packages(import java.sql.*)
//         * 2) Load drivers(comes from jar file)
//         * 3) Register Drivers
//         * 4) Create Connection
//         * 5) Create Statement
//         * 6) Execute Statement
//         * 7) Close connection
//         */
//
//
//        // 2) load drives and 3) Register Drivers : This is step is optional
//
//
//        Class.forName("org.postgresql.Driver"); // gives exception
//
//
//        // 4) Create Connection
//        String url="jdbc:postgresql://localhost:5432/demo";
//        String user="postgres";
//        String pass="Vinayaka@502";
//        Connection con= DriverManager.getConnection(url,user,pass); // gives exception
//        System.out.println("Connection is Established");
//
//
//        //   5) Creating Statement
//
//        Statement st=con.createStatement();
//
//
//        // to insert
//        String sql="delete from students where rollno=6" ;
//
//
//
//        Boolean status=st.execute(sql); // this will return boolean value.
//        // If we use select query then if we use execute it returns to true .it means its displayed all the values.
//        // But for insert , delete and update query it returns to false it means it worked well and updated the database.
//        System.out.println(status);
//
//
//        // 7) Connection close
//        con.close();
//        System.out.println("Connection is Terminated");
//
//
//
//    }
//}







//// Method 7: prepared statement : insert query using prepared
//// prepared statement: when we try to insert data  we need to give data right like name='mike' like this
//// what if the input come from the user or webpage or console
//
//import java.sql.*; // 1) import packages
//
//public class DemoJDBC {
//    public static void main(String[] args) throws Exception {
//
//        /**
//         * 1) Import packages(import java.sql.*)
//         * 2) Load drivers(comes from jar file)
//         * 3) Register Drivers
//         * 4) Create Connection
//         * 5) Create Statement
//         * 6) Execute Statement
//         * 7) Close connection
//         */
//
//
//        // 2) load drives and 3) Register Drivers : This is step is optional
//
//
//        Class.forName("org.postgresql.Driver"); // gives exception
//
//
//        // 4) Create Connection
//        String url="jdbc:postgresql://localhost:5432/demo";
//        String user="postgres";
//        String pass="Vinayaka@502";
//        Connection con= DriverManager.getConnection(url,user,pass); // gives exception
//        System.out.println("Connection is Established");
//
//
//        String name="Rebacca Maikelson";
//        int rollno=6;
//        int marks=99;
//
//        String sql="insert into students values(?,?,?)";
//
//
//        //   5) Creating Statement
//
//        PreparedStatement st=con.prepareStatement(sql); //in prepared we need to give query here
//        st.setString(1,name);
//        st.setInt(2,rollno);
//        st.setInt(3,marks);
//
//        st.execute();
//
//
//
//
//        // 7) Connection close
//        con.close();
//        System.out.println("Connection is Terminated");
//
//
//
//    }
//}



//// Method 8: prepared statement : update query using prepared statement
//// prepared statement: when we try to insert data  we need to give data right like name='mike' like this
//// what if the input come from the user or webpage or console
//
//import java.sql.*; // 1) import packages
//
//public class DemoJDBC {
//    public static void main(String[] args) throws Exception {
//
//        /**
//         * 1) Import packages(import java.sql.*)
//         * 2) Load drivers(comes from jar file)
//         * 3) Register Drivers
//         * 4) Create Connection
//         * 5) Create Statement
//         * 6) Execute Statement
//         * 7) Close connection
//         */
//
//
//        // 2) load drives and 3) Register Drivers : This is step is optional
//
//
//        Class.forName("org.postgresql.Driver"); // gives exception
//
//
//        // 4) Create Connection
//        String url="jdbc:postgresql://localhost:5432/demo";
//        String user="postgres";
//        String pass="Vinayaka@502";
//        Connection con= DriverManager.getConnection(url,user,pass); // gives exception
//        System.out.println("Connection is Established");
//
//
//        String name="KOl Maikelson";
//        int rollno=1;
//        int marks=90;
//
//
//        String sql="update students set name=? where rollno=? and marks=?";
//
//
//        //   5) Creating Statement
//
//        PreparedStatement st=con.prepareStatement(sql); //in prepared we need to give query here
//        st.setString(1,name);
//        st.setInt(2,rollno);
//        st.setInt(3,marks);
//
//
//        st.execute();
//
//
//
//
//        // 7) Connection close
//        con.close();
//        System.out.println("Connection is Terminated");
//
//
//
//    }
//}









// Method 9: prepared statement : delete query using prepared statement
// prepared statement: when we try to insert data  we need to give data right like name='mike' like this
// what if the input come from the user or webpage or console

import java.sql.*; // 1) import packages

public class DemoJDBC {
    public static void main(String[] args) throws Exception {

        /**
         * 1) Import packages(import java.sql.*)
         * 2) Load drivers(comes from jar file)
         * 3) Register Drivers
         * 4) Create Connection
         * 5) Create Statement
         * 6) Execute Statement
         * 7) Close connection
         */


        // 2) load drives and 3) Register Drivers : This is step is optional


        Class.forName("org.postgresql.Driver"); // gives exception


        // 4) Create Connection
        String url="jdbc:postgresql://localhost:5432/demo";
        String user="postgres";
        String pass="Vinayaka@502";
        Connection con= DriverManager.getConnection(url,user,pass); // gives exception
        System.out.println("Connection is Established");

        String name="KOl Maikelson";
        int rollno=1;

        String sql="delete from students where name=? and rollno=? ";


        //   5) Creating Statement

        PreparedStatement st=con.prepareStatement(sql); //in prepared we need to give query here

        st.setString(1,name);
        st.setInt(2,rollno);

        
        st.execute();




        // 7) Connection close
        con.close();
        System.out.println("Connection is Terminated");



    }
}
