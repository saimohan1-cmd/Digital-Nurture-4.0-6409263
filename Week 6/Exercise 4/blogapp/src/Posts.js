import React,{Component} from 'react';
import Post from './Post';

class Posts extends Component {
  constructor(props) {
    super(props);
    this.state ={
      posts:[],
      hasError:false,
    };
  }

  loadPosts = async() => {
    try{
        const res = await fetch('https://jsonplaceholder.typicode.com/posts');
        const posts = await res.json();
        console.log("Fetched posts")
        this.setState({posts});
    }
    catch{
        console.log("Fetched failed")
        this.setState({hasError:true})
    }
  };

  componentDidMount() {
    this.loadPosts();
  }

  componentDidCatch(error, info) {
    alert("Something went Wrong");
    console.error("Error:", error, "Info:", info);
    this.setState({ hasError: true });
  }

  render() {
    const {posts,hasError } = this.state;

    if (hasError) {
      return <h2>Something went Wrong</h2>;
    }

    return (
      <div>
        <h1>Blog Posts</h1>
        {posts.map((post) => (
          <Post key={post.id} title={post.title} body={post.body} />
        ))}
      </div>
    );
  }
}

export default Posts;
