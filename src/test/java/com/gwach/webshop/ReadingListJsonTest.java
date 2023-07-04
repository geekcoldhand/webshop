package com.gwach.webshop;

import com.gwach.webshop.ReadingListController;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.json.JsonTest;
import org.springframework.boot.test.json.JacksonTester;

import java.io.IOException;

import static org.assertj.core.api.Assertions.assertThat;
@JsonTest public class ReadingListJsonTest {


    @Autowired
    private JacksonTester<ReadingListController> json;

    @Test
    public void SerializationReadingListTest() throws IOException {

//        ReadingListController readingList = new ReadingListController();
//
//        assertThat(json.write(readingList)).isStrictlyEqualToJson("expected.json");
//        assertThat(json.write(readingList)).hasJsonPathNumberValue("@.id");
//        assertThat(json.write(readingList)).extractingJsonPathNumberValue("@.id")
//                .isEqualTo(99);
//        assertThat(json.write(readingList)).hasJsonPathNumberValue("@.amount");
//        assertThat(json.write(readingList)).extractingJsonPathNumberValue("@.amount")
//                .isEqualTo(123.45);
    }

//    @Test
//    public void deserializeReadingListTest() throws IOException {
//        String expected = """
//           {
//               "id":99,
//               "amount":123.45
//           }
//           """;
//        assertThat(json.parse(expected))
//                .isEqualTo(new CashCard(99L, 123.45));
//        assertThat(json.parseObject(expected).id()).isEqualTo(99);
//        assertThat(json.parseObject(expected).amount()).isEqualTo(123.45);
//    }
}