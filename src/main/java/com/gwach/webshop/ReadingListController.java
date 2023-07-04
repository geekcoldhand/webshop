package com.gwach.webshop;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ReadingListController {

private ReadingListRepo readingListRepo;

@Autowired
public ReadingListController(ReadingListRepo readingListRepo){
    this.readingListRepo = readingListRepo;
}
@GetMapping("/reader")
public String readersBooks(@RequestParam(value = "reader", defaultValue = "no reader") String reader, Model model){

    //here we are setting the List of books to the reading list repo Interface so we can access the findByReader field
    List<Book> readerList = readingListRepo.findByReader(reader);
    if(readerList != null ){
        model.addAttribute("books", readerList);
    }
    return "readerList";
}
@PostMapping("/reader")
public String addToReadingList(@RequestParam(value= "reader", defaultValue = "no reader") String reader, Book book){
    book.setReader(reader);
    readingListRepo.save(book);
    return "added to {reader}";
}
}
