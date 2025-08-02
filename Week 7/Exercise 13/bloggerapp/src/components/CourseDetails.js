
export default function CourseDetails({courses}) {
  return (
    <div>
      <ul>
        {courses.map(course=>(
        <div key={course.id}>
        <h3>{course.cname}</h3>
        <h4>{course.date}</h4>
        </div>
      ))}
      </ul>
    </div>
  )
}
