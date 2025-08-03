import React, { useState } from 'react';
import './App.css';
import BookDetails from './components/BookDetails';
import BlogDetails from './components/BlogDetails';
import CourseDetails from './components/CourseDetails';

function App() {
  const [activeTab, setActiveTab] = useState('books');
  const [showContent, setShowContent] = useState(true);

  return (
    <div className="App">
      <h1>Blogger App</h1>
      
      <div className="controls">
        <button onClick={() => setActiveTab('books')}>Books</button>
        <button onClick={() => setActiveTab('blogs')}>Blogs</button>
        <button onClick={() => setActiveTab('courses')}>Courses</button>
        <button onClick={() => setShowContent(!showContent)}>
          Toggle Content
        </button>
      </div>

      {/* Method 1: Ternary Operator */}
      <div className="content">
        {activeTab === 'books' ? (
          <BookDetails />
        ) : activeTab === 'blogs' ? (
          <BlogDetails />
        ) : (
          <CourseDetails />
        )}
      </div>

      {/* Method 2: Logical && Operator */}
      {showContent && (
        <div className="additional-info">
          <h3>Additional Information</h3>
          {activeTab === 'books' && <p>Browse our book collection</p>}
          {activeTab === 'blogs' && <p>Read our latest blog posts</p>}
          {activeTab === 'courses' && <p>Explore our course offerings</p>}
        </div>
      )}

      {/* Method 3: Element Variables */}
      <div className="stats">
        {(() => {
          let content;
          switch(activeTab) {
            case 'books':
              content = <p>Currently showing: 12 books</p>;
              break;
            case 'blogs':
              content = <p>Currently showing: 5 blogs</p>;
              break;
            case 'courses':
              content = <p>Currently showing: 8 courses</p>;
              break;
            default:
              content = null;
          }
          return content;
        })()}
      </div>
    </div>
  );
}

export default App;