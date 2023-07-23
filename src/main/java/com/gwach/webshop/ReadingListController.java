package com.gwach.webshop;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.source.ConfigurationPropertyName;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@Controller
public class ReadingListController {

private ReadingListRepo readingListRepo;

@Autowired
public ReadingListController(ReadingListRepo readingListRepo){
    this.readingListRepo = readingListRepo;
}
@GetMapping("/reader")
public String readersBooks(@ModelAttribute  String reader, Model model){

    //here we are setting the List of books to the reading list repo Interface, so we can access the findByReader field
    List<Book> readerList = readingListRepo.findByReader(reader);
    if(readerList != null ){
        model.addAttribute("books", readerList);
    }
    return "readingList";
}
@PostMapping("/reader")
public String addToReadingList(@ModelAttribute @RequestParam String reader, Model model, Book book){
   ArrayList<String> formData = new ArrayList<>();
    try {
        if (book != null){
            formData.add(book.getTitle());
            formData.add(book.getAuthor());
            formData.add(book.getDescription());
            formData.add(book.getIsbn());
        }else {
            return "redirect not filled out entirely. form null";
        }
    }catch (Exception e){
    model.addAttribute("error", e.getMessage());
        return "errorPage";
    }
    book.setReader(reader);
    readingListRepo.save(book);
    return "errorPage";
}
}
