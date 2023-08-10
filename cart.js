// cart.js
const cart = [];

function addToCart(productName, price) {
    cart.push({ productName, price });
    alert(`Added ${productName} to cart!`);
}
