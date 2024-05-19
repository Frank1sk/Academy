document.addEventListener("DOMContentLoaded", function () {
    const url = "https://jsonplaceholder.typicode.com/posts?_start=0&_limit=10"; //Seleziono solo i primi 10 post con questo pezzetto di url: ?_start=0&_limit=10
  
    fetch(url)
      .then((response) => response.json())
      .then((posts) => {
        const postsDiv = document.getElementById("posts");
        posts.forEach((post) => {
          const postCard = document.createElement("div");
          postCard.classList.add("stile_post");
          postCard.innerHTML = `
        <h2>id: ${post.id}</h2>
        <p>Title: ${post.title}</p>
        <p>Body: ${post.body}</p>
        <br><br>
        `;
        postsDiv.appendChild(postCard);
        });
        
      })
      .catch((error) => console.error("Errore:", error));
  });
  