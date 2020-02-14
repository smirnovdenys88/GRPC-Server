package com.grpc.server;

import com.grpc.server.google.proto.Address;
import com.grpc.server.google.proto.Book;
import com.grpc.server.google.proto.Books;
import com.grpc.server.google.proto.User;
import io.grpc.stub.StreamObserver;

import java.util.ArrayList;
import java.util.List;

public class AddressBookImpl extends AddressBookGrpc.AddressBookImplBase {
    @Override
    public void getAddressByBook(Book request, StreamObserver<Address> responseObserver) {
        try {
            System.out.println("Book name: " + request.getNameBook());

            Address address = Address.newBuilder()
                    .setCountry("USA")
                    .setCity("Washington")
                    .setStreet("Massachusetts Ave NW")
                    .build();

            responseObserver.onNext(address);
            responseObserver.onCompleted();
        } catch (Exception e) {
            responseObserver.onError(e);
        }
    }

    @Override
    public void getBooksByUser(User request, StreamObserver<Books> responseObserver) {
        try {
            System.out.println("UserName: " + request.getUserName());

            List<Book> bookList = new ArrayList<Book>();
            for (int i = 0; i <= 20; i++) {
                Book book = Book.newBuilder()
                        .setNameBook("Some kind book " + i)
                        .setBookType(Book.BookType.HOME)
                        .setAuthor("Some kind author " + i)
                        .build();
                bookList.add(book);
            }

            Books books = Books.newBuilder()
                    .addAllArrayBooks(bookList)
                    .build();

            responseObserver.onNext(books);
            responseObserver.onCompleted();
        } catch (Exception e) {
            responseObserver.onError(e);
        }
    }
}
