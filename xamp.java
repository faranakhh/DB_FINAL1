import java.sql.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class xamp {

    public static void main(String[] args)
    {
       try
       {
           String stringOfNameOfTable;
           Class.forName("com.mysql.cj.jdbc.Driver");
           String url="jdbc:mysql://localhost:3306/piktogallery?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
           String user ="root";
           String pass ="";
           Connection con= DriverManager.getConnection(url,user,pass);
           if(con!=null){

               int number;
               do{
                   System.out.println("/////////");
               System.out.println("choose a number from below");
               System.out.println(" 1-show tables \n 2-insert to tables \n 3-delete some records \n 4-update tables\n 5-end");
               Scanner myscanner = new Scanner(System.in);
               number = myscanner.nextInt();

               switch (number) {
                   case 1: {
                       System.out.println("enter the name of the table you want to see:");
                       Scanner myscanner2 = new Scanner(System.in);
                       stringOfNameOfTable = myscanner2.nextLine();
                       switch (stringOfNameOfTable) {
                           case "artist": {
                               String query = "select * from artist";
                               var statement = con.prepareStatement(query);
                               ResultSet r = statement.executeQuery();
                               while (r.next()) {
                                   System.out.printf("///////////");
                                   System.out.printf("\n");

                                   String fullname = r.getString("fullname");
                                   String national_code = r.getString("national_code");
                                   String phonenumber = r.getString("phonenumber");
                                   int age = r.getInt("age");
                                   int id = r.getInt("id");
                                   System.out.print("fullname=");
                                   System.out.println(fullname);
                                   System.out.print("national_code=");
                                   System.out.println(national_code);
                                   System.out.print("phonenumber=");
                                   System.out.println(phonenumber);
                                   System.out.print("age=");
                                   System.out.println(age);
                                   System.out.print("id=");
                                   System.out.println(id);

                               }
                                break;

                           }
                           case "info_gallery": {
                               String query = "select * from info_gallery";
                               var statement = con.prepareStatement(query);
                               ResultSet p = statement.executeQuery();
                               while (p.next()) {
                                   System.out.printf("///////////");
                                   System.out.printf("\n");
                                   String name = p.getString("namegall");
                                   String date =p.getString("date_start");
                                   String date_end =p.getString("date_end");
                                   int id = p.getInt("id");
                                   System.out.print("namegall=");
                                   System.out.println(name);
                                   System.out.print("date_start=");
                                   System.out.println(date);
                                   System.out.print("date_end=");
                                   System.out.println(date_end);
                                   System.out.print("id=");
                                   System.out.println(id);


                               }
                               break;
                           }
                           case "artwork":{
                               String query = "select * from artwork";
                               var statement = con.prepareStatement(query);
                               ResultSet q = statement.executeQuery();
                               while (q.next()) {
                                   System.out.printf("///////////");
                                   System.out.printf("\n");
                                   String name = q.getString("name_artwork");
                                   String explanation = q.getString("exp");
                                   String field = q.getString("field");
                                   String producer = q.getString("artist_id");
                                   String gallery = q.getString("gallery_id");
                                   int price = q.getInt("price");
                                   int id = q.getInt("id");
                                   System.out.print("name_artwork=");
                                   System.out.println(name);
                                   System.out.print("exp=");
                                   System.out.println(explanation);
                                   System.out.print("field=");
                                   System.out.println(field);
                                   System.out.print("artist_id=");
                                   System.out.println(producer);
                                   System.out.print("gallery_id=");
                                   System.out.println(gallery);
                                   System.out.print("price=");
                                   System.out.println(price);
                                   System.out.print("id=");
                                   System.out.println(id);

                           }
                               break;
                       }
                           case"auction": {
                               String query = "select * from auction";
                               var statement = con.prepareStatement(query);
                               ResultSet a = statement.executeQuery();
                               while (a.next()) {
                                   System.out.printf("///////////");
                                   System.out.printf("\n");
                                   int id = a.getInt("id");
                                   String date = a.getString("date_au");
                                   String gallery = a.getString("gallery_id");
                                   System.out.print("id=");
                                   System.out.println(id);
                                   System.out.print("date=");
                                   System.out.println(date);
                                   System.out.print("gallery_id=");
                                   System.out.println(gallery);
                               }
                               break;
                           }
                           case"customer":{
                               String query = "select * from customer";
                               var statement = con.prepareStatement(query);
                               ResultSet d = statement.executeQuery();
                               while (d.next()) {
                                   System.out.printf("///////////");
                                   System.out.printf("\n");
                                   int id = d.getInt("id");
                                   String id_cus = d.getString("id_cus");
                                   String fullname = d.getString("fullname");
                                   String phonenumber = d.getString("phonenumber");
                                   System.out.print("id=");
                                   System.out.println(id);
                                   System.out.print("id_cus=");
                                   System.out.println(id_cus);
                                   System.out.print("fullname=");
                                   System.out.println(fullname);
                                   System.out.print("phonenumber=");
                                   System.out.println(phonenumber);
                               }
                               break;
                           }

                           case"factors": {
                               String query = "select * from factors";
                               var statement = con.prepareStatement(query);
                               ResultSet b = statement.executeQuery();
                               while (b.next()) {
                                   System.out.printf("///////////");
                                   System.out.printf("\n");
                                   int id = b.getInt("id");
                                   int id_cus = b.getInt("id_customer");
                                   int id_au = b.getInt("id_au");
                                   String price_final = b.getString("price_final");
                                   int artist_id = b.getInt("artist_id");
                                   System.out.print("id=");
                                   System.out.println(id);
                                   System.out.print("id_cus=");
                                   System.out.println(id_cus);
                                   System.out.print("id_au=");
                                   System.out.println(id_au);
                                   System.out.print("price_final=");
                                   System.out.println(price_final);
                                   System.out.print("artist_id=");
                                   System.out.println(artist_id);
                               }
                               break;
                           }

                           }
                           break;
                   }

                   case 2:{
                       System.out.println("enter name of the table you want to insert to:");
                       Scanner scanner3= new Scanner(System.in);
                       Scanner scanner= new Scanner(System.in);

                       String nameTable= scanner3.nextLine();
                       String query="";
                       PreparedStatement prstatement;
                       switch (nameTable){
                           case"artist":{
                                query ="insert into artist(id,fullname,national_code,phonenumber,age)"+"values(?,?,?,?,?)";
                                prstatement =con.prepareStatement(query);
                               System.out.println("enter a id for this row:");
                               int id = scanner3.nextInt();
                               prstatement.setInt(1,id);
                               System.out.println("enter fullname of artist:");
                               scanner3.nextLine();
                                String fullname = scanner3.nextLine();
                                prstatement.setString(2,fullname);
                               System.out.println("enter nationalCode of artist:");

                               String nationalCode = scanner3.nextLine();
                               prstatement.setString(3,nationalCode);
                               System.out.println("enter phoneNumber of artist:");
                               String phoneNumber = scanner3.nextLine();
                               prstatement.setString(4,phoneNumber);
                               System.out.println("enter age of artist");
                               String age=scanner3.nextLine();
                               prstatement.setString(5,age);
                               prstatement.execute();
                               System.out.println("insert completed");
                                    break;
                           }
                           case"info_gallery":{
                               query ="insert into info_gallery(id,namegall,date_start,date_end)"+"values(?,?,?,?)";
                               prstatement =con.prepareStatement(query);
                               System.out.println("enter a id for this row:");
                               int id = scanner3.nextInt();
                               prstatement.setInt(1,id);
                               System.out.println("enter a name for this gallery:");
                               scanner3.nextLine();
                               String namegall= scanner3.nextLine();
                               prstatement.setString(2,namegall);
                               System.out.println("enter a date_start for this gallery like:2018-09-08:");
                               String start = scanner.next();
                               SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
                               java.util.Date dateStr = formatter.parse(start);
                               java.sql.Date mydate = new java.sql.Date(dateStr.getTime());
                               prstatement.setDate(3, mydate);
                               System.out.println("enter a date_end for this gallery like:2018-09-08 :");
                               String end = scanner.next();
                               java.util.Date dateStr2 = formatter.parse(end);
                               java.sql.Date mydate2 = new java.sql.Date(dateStr.getTime());
                               prstatement.setDate(4,mydate2);
                               prstatement.execute();
                               System.out.println("insert completed");
                               break;
                           }
                           case"artwork":{
                               query ="insert into artwork(id,name_artwork,exp,field,artist_id,gallery_id,price)"+"values(?,?,?,?,?,?,?)";
                               prstatement =con.prepareStatement(query);
                               System.out.println("enter a id for this row:");
                               int id = scanner3.nextInt();
                               prstatement.setInt(1,id);
                               System.out.println("enter a name for this row:");
                               scanner3.nextLine();
                               String namee = scanner3.nextLine();
                               prstatement.setString(2,namee);
                               System.out.println("enter a explanation for this row:");
                               String exp = scanner.nextLine();
                               prstatement.setString(3,exp);
                               System.out.println("enter a field between 'paint' or 'statue' or 'photo' for this row:");
                               String field = scanner3.nextLine();
                               prstatement.setString(4,field);
                               System.out.println("enter a artist_id for this row(be careful this id exist in artist table):");
                               int artistId = scanner.nextInt();
                               prstatement.setInt(5,artistId);
                               System.out.println("enter a gallery_id for this row(be careful this id exist in info_gallery table):");
                               int galleryId = scanner3.nextInt();
                               prstatement.setInt(6,galleryId);
                               System.out.println("enter a price for this row:");
                               scanner.nextLine();
                               String price = scanner.nextLine();
                               prstatement.setString(7,price);
                               prstatement.execute();
                               System.out.println("insert completed");
                               break;
                           }
                           case"auction":{
                               query ="insert into auction(id,date_au,gallery_id)"+"values(?,?,?)";
                               prstatement =con.prepareStatement(query);
                               System.out.println("enter a id for this row:");
                               int id = scanner3.nextInt();
                               prstatement.setInt(1,id);
                               System.out.println("enter a date for this auction like:2018-09-08:");
                               String date = scanner.next();
                               SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
                               java.util.Date dateStr = formatter.parse(date);
                               java.sql.Date mydate = new java.sql.Date(dateStr.getTime());
                               prstatement.setDate(2, mydate);
                               System.out.println("enter a gallery_id for this row(be careful this id exist in info_gallery table):");
                               int gallery_id = scanner3.nextInt();
                               prstatement.setInt(3,gallery_id);
                               prstatement.execute();
                               System.out.println("insert completed");
                               break;
                           }
                           case"customer":{
                               query ="insert into customer(id,id_cus,fullname,phonenumber)"+"values(?,?,?,?)";
                               prstatement =con.prepareStatement(query);
                               System.out.println("enter a id for this row:");
                               int id = scanner3.nextInt();
                               prstatement.setInt(1,id);
                               System.out.println("enter a id_customer for this row:");
                               scanner3.nextLine();
                               String  id_cus = scanner3.nextLine();
                               prstatement.setString(2,id_cus);
                               System.out.println("enter a fullName for this row:");
                               String  fullName = scanner3.nextLine();
                               prstatement.setString(3,fullName);
                               System.out.println("enter a phonenumber for this row:");
                               String  phonenumber = scanner3.nextLine();
                               prstatement.setString(4,phonenumber);
                               prstatement.execute();
                               System.out.println("insert completed");
                               break;

                           }
                           case"factors":{
                               query ="insert into factors(id,id_customer,id_au,price_final,artist_id)"+"values(?,?,?,?,?)";
                               prstatement =con.prepareStatement(query);
                               System.out.println("enter a id for this row:");
                               int id = scanner3.nextInt();
                               prstatement.setInt(1,id);
                               System.out.println("enter a id_costomer for this row(be careful it exists in customer table):");
                               int id_costomer = scanner3.nextInt();
                               prstatement.setInt(2,id_costomer);
                               System.out.println("enter a id_auction for this row(be careful it exists in auction table):");
                               int id_auction = scanner3.nextInt();
                               prstatement.setInt(3,id_auction);
                               System.out.println("enter a price_final for this row:");
                               scanner3.nextLine();
                               String  price_final = scanner3.nextLine();
                               prstatement.setString(4,price_final);
                               System.out.println("enter a artist_id for this row(be careful it exists in auction table):");
                               int artist_id  = scanner3.nextInt();
                               prstatement.setInt(5,artist_id );
                               prstatement.execute();
                               System.out.println("insert completed");
                               break;
                           }
                       }
                    break;
                   }
                   case 3:{
                       System.out.println("enter name of the table you want to delete some record:");
                       Scanner scanner4= new Scanner(System.in);
                        String name_table= scanner4.nextLine();

                        switch (name_table){
                            case "artist" :{
                                String query = "delete from artist where id= ?";
                                try {
                                PreparedStatement prestatement = con.prepareStatement(query);
                                System.out.println("enter id (not national_cod) of artist you want to delete his or her information in that row: ");
                                String id= scanner4.nextLine();
                                prestatement.setString(1,id);
                                prestatement.executeUpdate();
                                System.out.println("deletion was successful");

                            }
                            catch (SQLException e){
                                System.out.println("this cant be deleted");
                            }
                                break;}

                            case"info_gallery":{
                                String query = "delete from info_gallery where id= ?";
                                try {
                                PreparedStatement prestatement = con.prepareStatement(query);
                                System.out.println("enter id  of the row you want to delete  information in that row: ");
                                String id= scanner4.nextLine();
                                prestatement.setString(1,id);
                                prestatement.executeUpdate();
                                System.out.println("deletion was successful");

                            }
                            catch (SQLException e){
                                System.out.println("this cant be deleted");
                            }
                                break;}
                            case "artwork":{
                                String query = "delete from artwork where id= ?";
                                try{
                                PreparedStatement prestatement = con.prepareStatement(query);
                                System.out.println("enter id  of the row you want to delete  information in that row: ");
                                String id= scanner4.nextLine();
                                prestatement.setString(1,id);
                                prestatement.executeUpdate();
                                System.out.println("deletion was successful");


                            }catch (SQLException e){
                                    System.out.println("it cant be deleted");
                                }
                                break;}
                            case"auction":{
                                String query = "delete from auction where id= ?";
                                try{


                                PreparedStatement prestatement = con.prepareStatement(query);
                                System.out.println("enter id  of the row you want to delete  information in that row: ");
                                String id= scanner4.nextLine();
                                prestatement.setString(1,id);
                                prestatement.executeUpdate();
                                System.out.println("deletion was successful");

                            }catch (SQLException e){
                                    System.out.println("it can not be deleted");
                                }
                                break;}
                            case"customer":{
                                String query = "delete from customer where id= ?";
                                try{
                                PreparedStatement prestatement = con.prepareStatement(query);
                                System.out.println("enter id  of the row you want to delete  information in that row: ");
                                String id= scanner4.nextLine();
                                prestatement.setString(1,id);
                                prestatement.executeUpdate();
                                System.out.println("deletion was successful");

                            }catch (SQLException e){
                                    System.out.println("it can not be deleted");
                                }
                                break;}

                            case"factors":{
                                String query = "delete from factors where id= ?";
                                try{
                                PreparedStatement prestatement = con.prepareStatement(query);
                                System.out.println("enter id  of the row you want to delete  information in that row: ");
                                String id= scanner4.nextLine();
                                prestatement.setString(1,id);
                                prestatement.executeUpdate();
                                System.out.println("deletion was successful");

                            }catch (SQLException e){
                                    System.out.println("it can not be deleted");
                                }
                            break;}

                        }
                        break;
                   }
                   case 4:{
                       String query="";
                       Scanner scanner5=new Scanner(System.in);
                       System.out.println("enter name of the table you want to update:");
                       String nametable=scanner5.nextLine();
                       Scanner mysc = new Scanner(System.in);
                       switch (nametable){
                           case"artist":{
                               Statement statement = con.createStatement();
                               System.out.println("which coulmn of artist table you want to update");
                               String column = scanner5.nextLine();
                               switch (column){
                                   case "fullname":{
                                       try{
                                       System.out.println("enter current id(not national_code) of that person:");
                                       int id2= scanner5.nextInt();
                                       System.out.println("enter the new fullname:");
                                       String newwfullname = mysc.nextLine();
                                       query = "UPDATE artist SET fullname =? WHERE id =?";

                                       PreparedStatement preparedStatement = con.prepareStatement(query);
                                       preparedStatement.setString(1,newwfullname);
                                       preparedStatement.setInt(2,id2);
                                       preparedStatement.executeUpdate();
                                       System.out.println("update was successful");

                                   }catch (SQLException e){
                                           System.out.println("error please try again");
                                       }
                                       break;}
                                   case"national_code":{
                                       try{
                                       System.out.println("enter current id(not national_code) of that person you want to update:");
                                       int id = mysc.nextInt();
                                       System.out.println("enter the new national_code:");
                                       String national_code2 = scanner5.nextLine();
                                       query = "UPDATE artist SET national_code=? WHERE id =?";

                                       PreparedStatement preparedStatement = con.prepareStatement(query);
                                       preparedStatement.setString(1,national_code2);
                                       preparedStatement.setInt(2,id);
                                       preparedStatement.executeUpdate();
                                       System.out.println("update was successful");

                                   } catch (SQLException e){
                                           System.out.println("error please try again");
                                       }
                                       break;}
                                   case"phonenumber":{
                                       try{
                                       System.out.println("enter current id(not national_code) of that person");
                                       int id = mysc.nextInt();
                                       System.out.println("enter the new phonenumber:");
                                       String phonenumberr = scanner5.nextLine();
                                       query = "UPDATE artist SET phonenumber =? WHERE id =?";

                                       PreparedStatement preparedStatement = con.prepareStatement(query);
                                       preparedStatement.setString(1,phonenumberr);
                                       preparedStatement.setInt(2,id);
                                       preparedStatement.executeUpdate();
                                       System.out.println("update was successful");

                                   }catch (SQLException e){
                                           System.out.println("error please try again");
                                       }
                                       break;}
                                   case "age":{
                                       try{
                                       System.out.println("enter current id of the person you want to update him or her age:");
                                       int id = mysc.nextInt();
                                       System.out.println("enter the new age:");
                                       String agee = scanner5.nextLine();
                                       query = "UPDATE artist SET age =? WHERE id =?";
                                       PreparedStatement preparedStatement = con.prepareStatement(query);
                                       preparedStatement.setString(1,agee);
                                       preparedStatement.setInt(2,id);
                                       preparedStatement.executeUpdate();
                                       System.out.println("update was successful");

                                   }catch (SQLException e){
                                           System.out.println("error please try again");
                                       }
                                       break;}
                               }
                               break;
                           }
                           case"info_gallery":{
                               Statement statement = con.createStatement();
                               System.out.println("which coulmn of info_gallery table you want to update");
                               String column = scanner5.nextLine();
                               switch (column){
                                   case"date_start":{
                                       try {

                                       System.out.println("enter id of the gallery you want to update its date_start:");
                                       int id=mysc.nextInt();
                                       System.out.println("enter the new date_start:");
                                       String newdate_start = scanner5.nextLine();
                                       query = "UPDATE info_gallery SET date_start=? WHERE id =?";
                                       PreparedStatement preparedStatement = con.prepareStatement(query);
                                       preparedStatement.setString(1,newdate_start);
                                       preparedStatement.setInt(2,id);
                                       preparedStatement.executeUpdate();
                                       System.out.println("update was successful");

                                   }catch (SQLException e){
                                           System.out.println("please try again");
                                       }
                                       break;}
                                   case "date_end":{
                                       try{
                                       System.out.println("enter id of the gallery you want to update its date_end:");
                                       int id=mysc.nextInt();
                                       System.out.println("enter the new date_end:");
                                       String newdate_end = scanner5.nextLine();
                                       query = "UPDATE info_gallery SET date_end=? WHERE id =?";
                                       PreparedStatement preparedStatement = con.prepareStatement(query);
                                       preparedStatement.setString(1,newdate_end);
                                       preparedStatement.setInt(2,id);
                                       preparedStatement.executeUpdate();
                                       System.out.println("update was successful");


                                   }catch (SQLException e){
                                           System.out.println("please try again");
                                       }
                                       break;}
                                   case "namegall":{
                                       try {

                                       System.out.println("enter id of the gallery you want to update its name:");
                                       int id=mysc.nextInt();
                                       System.out.println("enter the new name:");
                                       String newname = scanner5.nextLine();
                                       query = "UPDATE info_gallery SET namegall =?where id=?";
                                       PreparedStatement preparedStatement = con.prepareStatement(query);
                                       preparedStatement.setString(1,newname);
                                       preparedStatement.setInt(2,id);
                                       preparedStatement.executeUpdate();
                                       System.out.println("update was successful");

                                   }catch (SQLException e){
                                           System.out.println("please try again");
                                       }
                                       break;}
                                   case "id":{
                                       System.out.println("sorry ID can not change because it is primary key in this table ");
                                       break;
                                   }


                               }
                            break;
                           }
                           case"artwork":{
                               Statement statement = con.createStatement();
                               System.out.println("which coulmn of artwork table you want to update");
                               String column = scanner5.nextLine();
                               switch (column){
                                   case"name_artwork":{
                                       try {

                                       System.out.println("enter id of the artwork you want to update its name:");
                                       int id=mysc.nextInt();
                                       System.out.println("enter the new name:");
                                       String newname = scanner5.nextLine();
                                       query = "UPDATE artwork SET name_artwork =?where id=?";
                                       PreparedStatement preparedStatement = con.prepareStatement(query);
                                       preparedStatement.setString(1,newname);
                                       preparedStatement.setInt(2,id);
                                       preparedStatement.executeUpdate();
                                       System.out.println("update was successful");


                                   }catch (SQLException e){
                                           System.out.println("please try again");
                                       }
                                       break;}
                                   case"exp":{
                                       try {

                                       System.out.println("enter id of the exp you want to update its explanation:");
                                       int id=mysc.nextInt();
                                       System.out.println("enter the new explanation :");
                                       String newexplanation = scanner5.nextLine();
                                       query = "UPDATE artwork SET exp =?where id=?";
                                       PreparedStatement preparedStatement = con.prepareStatement(query);
                                       preparedStatement.setString(1,newexplanation);
                                       preparedStatement.setInt(2,id);
                                       preparedStatement.executeUpdate();
                                       System.out.println("update was successful");

                                   }catch (SQLException e){
                                           System.out.println("please try again");
                                       }
                                       break;}
                                   case"field":{
                                       try{
                                       System.out.println("enter id of the field you want to update its explanation:");
                                       int id=mysc.nextInt();
                                       System.out.println("enter the new field from 'paint'or 'photo' or 'statue' :");
                                       String newfield = scanner5.nextLine();
                                       query = "UPDATE  artwork SET field =?where id=?";
                                       PreparedStatement preparedStatement = con.prepareStatement(query);
                                       preparedStatement.setString(1,newfield);
                                       preparedStatement.setInt(2,id);
                                       preparedStatement.executeUpdate();
                                       System.out.println("update was successful");

                                   }catch (SQLException e){
                                           System.out.println("please try again");
                                       }
                                       break;}
                                   case"artist_id":{
                                       try {


                                       System.out.println("enter id of the row you want to update its artist_id:");
                                       int id=mysc.nextInt();
                                       System.out.println("enter the new artist_id(be careful that this id exist in artist table):");
                                       String neweArtist_id = scanner5.nextLine();
                                       query = "UPDATE artwork SET artist_id =?where id=?";
                                       PreparedStatement preparedStatement = con.prepareStatement(query);
                                       preparedStatement.setString(1,neweArtist_id);
                                       preparedStatement.setInt(2,id);
                                       preparedStatement.executeUpdate();
                                       System.out.println("update was successful");

                                   }catch (SQLException e){
                                           System.out.println("please try again");
                                       }
                                       break;}
                                   case"gallery_id":{
                                       try{
                                       System.out.println("enter id of the row you want to update its gallery_id:");
                                       int id=mysc.nextInt();
                                       System.out.println("enter the new gallery_id (be careful that this id exist in info_gallery table) :");
                                       String nawgallery_id= scanner5.nextLine();
                                       query = "UPDATE artwork SET gallery_id =?where id=?";
                                       PreparedStatement preparedStatement = con.prepareStatement(query);
                                       preparedStatement.setString(1,nawgallery_id);
                                       preparedStatement.setInt(2,id);
                                       preparedStatement.executeUpdate();
                                       System.out.println("update was successful");

                                   }catch (SQLException e){
                                           System.out.println("please try again");
                                       }
                                       break;}
                                   case"price":{
                                       try {

                                       System.out.println("enter id of the row you want to update its price:");
                                       int id=mysc.nextInt();
                                       System.out.println("enter the new price :");
                                       String newprice= scanner5.nextLine();
                                       query = "UPDATE artwork SET price =?where id=?";
                                       PreparedStatement preparedStatement = con.prepareStatement(query);
                                       preparedStatement.setString(1,newprice);
                                       preparedStatement.setInt(2,id);
                                       preparedStatement.executeUpdate();
                                       System.out.println("update was successful");

                                   }catch (SQLException e){
                                           System.out.println("please try again");
                                       }
                                       break;}

                               }
                               break;
                           }
                           case "auction":{
                               Statement statement = con.createStatement();
                               System.out.println("which coulmn of auction table you want to update");
                               String column = scanner5.nextLine();
                               switch (column){
                                   case"date_au":{
                                       try {
                                       System.out.println("enter id of the row you want to update its date:");
                                       int id=mysc.nextInt();
                                       System.out.println("enter the new date (put it in '' :");
                                       String newdate= scanner5.nextLine();
                                       query = "UPDATE auction SET date_au =?where id=?";
                                       PreparedStatement preparedStatement = con.prepareStatement(query);
                                       preparedStatement.setString(1,newdate);
                                       preparedStatement.setInt(2,id);
                                       preparedStatement.executeUpdate();
                                       System.out.println("update was successful");

                                   }catch (SQLException e){
                                           System.out.println("please try again");
                                       }
                                       break;}
                                   case"gallery_id":{
                                       try {

                                       System.out.println("enter id of the row you want to update its gallery_id:");
                                       int id=mysc.nextInt();
                                       System.out.println("enter the new gallery_id (be careful that this id exist in info_gallery table) :");
                                       String nawgallery_id= scanner5.nextLine();
                                       query = "UPDATE auction SET gallery_id =?where id=?";
                                       PreparedStatement preparedStatement = con.prepareStatement(query);
                                       preparedStatement.setString(1,nawgallery_id);
                                       preparedStatement.setInt(2,id);
                                       preparedStatement.executeUpdate();
                                       System.out.println("update was successful");

                                   }catch (SQLException e){
                                           System.out.println("please try again");
                                       }
                                       break;}
                                   case"id":{
                                       System.out.println("sorry it can not be updated");
                                       break;
                                   }
                               }
                            break;
                           }
                           case "customer":{
                               Statement statement = con.createStatement();
                               System.out.println("which coulmn of customer  table you want to update");
                               String column = scanner5.nextLine();
                               switch (column){
                                   case"id_cus":{
                                       try{
                                       System.out.println("enter id of the row you want to update its id_cus:");
                                       int id=mysc.nextInt();
                                       System.out.println("enter the new id_cus :");
                                       String newidcus= scanner5.nextLine();
                                       query = "UPDATE customer SET id_cus =?where id=?";
                                       PreparedStatement preparedStatement = con.prepareStatement(query);
                                       preparedStatement.setString(1,newidcus);
                                       preparedStatement.setInt(2,id);
                                       preparedStatement.executeUpdate();
                                       System.out.println("update was successful");

                                   }catch (SQLException e){
                                           System.out.println("please try again");
                                       }
                                       break;}
                                   case"fullname":{
                                       try{
                                       System.out.println("enter id of the row you want to update its fullname:");
                                       int id=mysc.nextInt();
                                       System.out.println("enter the new fullname :");
                                       String newfullname= scanner5.nextLine();
                                       query = "UPDATE customer SET fullname =?where id=?";
                                       PreparedStatement preparedStatement = con.prepareStatement(query);
                                       preparedStatement.setString(1,newfullname);
                                       preparedStatement.setInt(2,id);
                                       preparedStatement.executeUpdate();
                                       System.out.println("update was successful");

                                   }catch (SQLException e){
                                           System.out.println("please try again");
                                       }
                                       break;}
                                   case"phonenumber":{
                                       try {

                                       System.out.println("enter id of the row you want to update its phonenumber:");
                                       int id=mysc.nextInt();
                                       System.out.println("enter the new phonenumber :");
                                       String newphonenumber= scanner5.nextLine();
                                       query = "UPDATE customer SET phonenumber =?where id=?";
                                       PreparedStatement preparedStatement = con.prepareStatement(query);
                                       preparedStatement.setString(1,newphonenumber);
                                       preparedStatement.setInt(2,id);
                                       preparedStatement.executeUpdate();
                                       System.out.println("update was successful");


                                   }catch (SQLException e){
                                           System.out.println("please try again");
                                       }
                                       break;}
                                   case"id":{
                                       System.out.println("sorry it can not be updated");
                                       break;
                                   }
                               }
                               break;
                           }
                           case"factors":{
                               Statement statement = con.createStatement();
                               System.out.println("which coulmn of factors table you want to update");
                               String column = scanner5.nextLine();
                               switch (column){
                                   case"id_customer":{
                                       try{
                                       System.out.println("enter id of the row you want to update its id_cus:");
                                       int id=mysc.nextInt();
                                       System.out.println("enter the new id_customer(be careful this new id exist in customer table) :");
                                       int newidcus= scanner5.nextInt();
                                       query = "UPDATE factors SET id_customer =?where id=?";
                                       PreparedStatement preparedStatement = con.prepareStatement(query);
                                       preparedStatement.setInt(1,newidcus);
                                       preparedStatement.setInt(2,id);
                                       preparedStatement.executeUpdate();
                                       System.out.println("update was successful");

                                   }catch (SQLException e){
                                           System.out.println("please try again");
                                       }
                                       break;}
                                   case"id_au":{
                                       try {

                                       System.out.println("enter id of the row you want to update its id_au:");
                                       int id=mysc.nextInt();
                                       System.out.println("enter the new id_au(be careful this new id exist in auction table) :");
                                       int newidau= scanner5.nextInt();
                                       query = "UPDATE factors SET id_au =?where id=?";
                                       PreparedStatement preparedStatement = con.prepareStatement(query);
                                       preparedStatement.setInt(1,newidau);
                                       preparedStatement.setInt(2,id);
                                       preparedStatement.executeUpdate();
                                       System.out.println("update was successful");

                                   }catch (SQLException e){
                                           System.out.println("please try again");
                                       }
                                       break;}
                                   case"price_final":{
                                       try{
                                       System.out.println("enter id of the row you want to update its price_final:");
                                       int id=mysc.nextInt();
                                       System.out.println("enter the new price_final:");
                                       int newprice= scanner5.nextInt();
                                       query = "UPDATE factors SET price_final =?where id=?";
                                       PreparedStatement preparedStatement = con.prepareStatement(query);
                                       preparedStatement.setInt(1,newprice);
                                       preparedStatement.setInt(2,id);
                                       preparedStatement.executeUpdate();
                                       System.out.println("update was successful");

                                   }catch (SQLException e){
                                           System.out.println("please try again");
                                       }
                                       break;}
                                   case"artist_id":{
                                       try {
                                           System.out.println("enter id of the row you want to update its artist_id:");
                                           int id = mysc.nextInt();
                                           System.out.println("enter the new artist_id(be careful this new id exist in artist table) :");
                                           int newartist_id = mysc.nextInt();
                                           query = "UPDATE factors SET artist_id =? where id=?";
                                           PreparedStatement preparedStatement = con.prepareStatement(query);
                                           preparedStatement.setInt(1, newartist_id);
                                           preparedStatement.setInt(2, id);
                                           preparedStatement.executeUpdate();
                                           System.out.println("update was successful");
                                       }catch (SQLException e){
                                           System.out.println("please try again");
                                       }
                                       break;}
                               }
                          break; }
                       }
                       break;
                   }
               }

               }
            while (number!=5);
           }
       }
       catch (ClassNotFoundException e)
       {
           e.printStackTrace();
       }
       catch (SQLException e)
       {
           e.printStackTrace();

       } catch (ParseException e) {
           e.printStackTrace();
       }
    }
}
