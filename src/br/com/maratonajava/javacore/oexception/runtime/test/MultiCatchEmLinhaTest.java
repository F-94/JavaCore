package br.com.maratonajava.javacore.oexception.runtime.test;

import java.io.FileNotFoundException;
import java.sql.SQLException;

public class MultiCatchEmLinhaTest {
    public static void main(String[] args) {
        try{
            talvezLanceException();
        }catch (SQLException| FileNotFoundException e){
            e.printStackTrace();
        }
    }
    private static void talvezLanceException() throws SQLException, FileNotFoundException{

    }
}
