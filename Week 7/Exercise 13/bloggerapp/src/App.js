import './App.css';
import BookDetails from './components/BookDetails';
import BlogDetails from './components/BlogDetails';
import CourseDetails from './components/CourseDetails';

function App() {
  const books = [
    {id:101,bname:"Master React",price:670},
    {id:102,bname:"Deep Dive into Angular 11",price:800},
    {id:103,bname:"Mongo Essentials",price:450},

  ];
  const blogs = [
    {id:101,title:"React Learning",author:"Stephen Biz",description:"Welocme to learning React!"},
    {id:102,title:"Installation",author:"Schewzdenier",description:"You can install React from npm."}

  ];
  const courses = [
    {id:101,cname:"Angular",date:"4/5/2021"},
    {id:102,cname:"React",date:"6/3/2021"},
    
  ]
  return (
    <div className='container'>
        <div className='mystyle1'>
          <h1>Course details</h1>
          <CourseDetails courses={courses}></CourseDetails>
        </div>
        <div className='st2'>
          <h1>Book Details</h1>
          <BookDetails books={books}></BookDetails>
        </div>
        <div className='v1'>
          <h1>Blog Details</h1>
          <BlogDetails blogs={blogs}></BlogDetails>
        </div>
    </div>
  );
}

export default App;
