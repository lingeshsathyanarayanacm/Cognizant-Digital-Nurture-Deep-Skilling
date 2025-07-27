import React from 'react';

class Posts extends React.Component {
    constructor(props) {
        super(props);
        this.state = {
            posts: [],
            isLoading: false,
            error: null
        };
    }

    loadPosts() {
        this.setState({ isLoading: true });
        
        // Example API call
        fetch('https://jsonplaceholder.typicode.com/posts')
            .then(response => {
                if (!response.ok) {
                    throw new Error('Failed to fetch posts');
                }
                return response.json();
            })
            .then(posts => this.setState({ posts, isLoading: false }))
            .catch(error => this.setState({ error, isLoading: false }));
    }

    componentDidMount() {
        this.loadPosts();
    }

    componentDidCatch(error, info) {
        console.error('Error caught by boundary:', error, info);
        this.setState({ error: error.message });
    }

    render() {
        const { posts, isLoading, error } = this.state;

        if (error) {
            return <div>Error: {error}</div>;
        }

        if (isLoading) {
            return <div>Loading posts...</div>;
        }

        return (
            <div className="posts-container">
                <h2>Posts</h2>
                <ul>
                    {posts.map(post => (
                        <li key={post.id}>
                            <h3>{post.title}</h3>
                            <p>{post.body}</p>
                        </li>
                    ))}
                </ul>
            </div>
        );
    }
}

export default Posts;