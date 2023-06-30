package com.gwach.webshop;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

//the interface class extends JPA repositories as this is the way spring will allow objects to
//be persisted to the database.

//By extending JpaRepository, ReadingListRepository inherits 18 methods that will allow for
//common persistence operations. The JpaRepository interface is parameterized with two parameters:
// the domain type that the repository will work with, and the type of its ID property. In this case
// Book is the domain type and Long is the type of its ID

//The interface will be implemented automatically at runtime when the application is started.

public interface ReadingListRepo extends JpaRepository<Book, Long> {
    List<Book> findByReader(String reader);
}
