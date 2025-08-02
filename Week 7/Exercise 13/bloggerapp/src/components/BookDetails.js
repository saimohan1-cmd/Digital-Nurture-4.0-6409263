import React from 'react'

export default function BookDetails({books}) {
  return (
    <div>
      <h2>Book Details</h2>
      {books.map(book=>(
        <div key={book.id}>
        <h3>{book.bname}</h3>
        <h4>{book.price}</h4>
        </div>
      ))}
    </div>
  )
}
