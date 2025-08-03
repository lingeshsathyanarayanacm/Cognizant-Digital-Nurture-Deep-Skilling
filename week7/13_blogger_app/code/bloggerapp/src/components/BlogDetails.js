import React from 'react';

const blogs = [
  { id: 101, title: 'Getting Started with React', category: 'React', date: '2023-01-15' },
  { id: 102, title: 'CSS Grid Layout', category: 'CSS', date: '2023-02-20' },
  { id: 103, title: 'JavaScript ES6 Features', category: 'JavaScript', date: '2023-03-10' }
];

function BlogDetails() {
  return (
    <div className="blog-details">
      <h2>Blog Details</h2>
      <div className="blog-list">
        {blogs.map(blog => (
          <div key={blog.id} className="blog-card">
            <h3>{blog.title}</h3>
            <p>Category: {blog.category}</p>
            <p>Published: {blog.date}</p>
          </div>
        ))}
      </div>
    </div>
  );
}

export default BlogDetails;