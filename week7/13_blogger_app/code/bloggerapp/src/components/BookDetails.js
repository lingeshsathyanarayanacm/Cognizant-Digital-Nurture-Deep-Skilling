import React from 'react';

const books = [
  { id: 1, title: 'React Essentials', author: 'John Doe', year: 2022 },
  { id: 2, title: 'JavaScript Mastery', author: 'Jane Smith', year: 2021 },
  { id: 3, title: 'CSS Secrets', author: 'Mike Johnson', year: 2020 }
];

function BookDetails() {
  return (
    <div className="book-details">
      <h2>Book Details</h2>
      <ul>
        {books.map(book => (
          <li key={book.id}>
            <h3>{book.title}</h3>
            <p>Author: {book.author}</p>
            <p>Year: {book.year}</p>
          </li>
        ))}
      </ul>
    </div>
  );
}

export default BookDetails;