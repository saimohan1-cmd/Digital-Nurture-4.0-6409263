
export default function BlogDetails({blogs}) {
  return (
    <div>
      <ul>
        {blogs.map(blog=>(
        <div key={blog.id}>
        <h2>{blog.title}</h2>
        <h3>{blog.author}</h3>
        <h4>{blog.description}</h4>
        </div>
      ))}
      </ul>
    </div>
  )
}
