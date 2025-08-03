import React from 'react';

const courses = [
  { id: 1001, title: 'React Fundamentals', duration: '4 weeks', level: 'Beginner' },
  { id: 1002, title: 'Advanced JavaScript', duration: '6 weeks', level: 'Intermediate' },
  { id: 1003, title: 'CSS Architecture', duration: '3 weeks', level: 'Advanced' }
];

function CourseDetails() {
  return (
    <div className="course-details">
      <h2>Course Details</h2>
      <table>
        <thead>
          <tr>
            <th>Title</th>
            <th>Duration</th>
            <th>Level</th>
          </tr>
        </thead>
        <tbody>
          {courses.map(course => (
            <tr key={course.id}>
              <td>{course.title}</td>
              <td>{course.duration}</td>
              <td>{course.level}</td>
            </tr>
          ))}
        </tbody>
      </table>
    </div>
  );
}

export default CourseDetails;