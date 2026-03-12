package rocks.zipcode.formattingbookinfo;


import org.junit.Assert;
import org.junit.Test;
import rocks.zipcode.formattingbookinfo.BookInfo;

/**
 * Unit test for simple App.
 */
public class BookInfoTest {

    @Test
    public void testconvertDollarsToEuros() {
        //: Given
        String expectedEuros = "EUR0.92";

        //: When
        String actualEuros =  BookInfo.convertPriceToEuros(1);

        //:Then
        Assert.assertEquals(expectedEuros, actualEuros);

    }

    @Test
    public void testformatToDollars(){
        //: Given
        String expectedDollars = "$1.00";


        //: When
        String actualDollars = BookInfo.formatToDollars(1.0);

        //: Then
        Assert.assertEquals(expectedDollars, actualDollars);
    }

    @Test
    public void testformatLine(){
        //:Given
        String book = "title:author:1.00";
        String expected = "Book Name: title\n" +
                "Author: author\n" +
                "Price: $1.00\n" +
                "Price(Euros): EUR0.92"+
                // 20 "-"
                "\n--------------------\n";

        //:When
        String actual = BookInfo.formatLine(book);

        //: Then
        Assert.assertEquals(expected, actual);

    }

    @Test
    public void testfileToList(){


    }
}


