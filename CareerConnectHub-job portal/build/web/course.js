/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
const product = [
    {
        id: 0,
        image: 'https://imgs.search.brave.com/jymEMpprH276pS_yRtciIl6ECIMkqXtzTQ4GMv-zCm4/rs:fit:860:0:0/g:ce/aHR0cHM6Ly9leGNl/bHJjb20uYi1jZG4u/bmV0L2Fzc2V0cy9h/ZG1pbi9ja2ZpbmRl/ci91c2VyZmlsZXMv/aW1hZ2VzLzIwMjNf/VVBMT0FEUy9EU19U/b29sczEuanBn',
        title: 'Data Science Course With Certifications',
        price: 900,
    },
    {
        id: 1,
        image: 'https://imgs.search.brave.com/hhn2YnhZnPwEpJX2BgBPmub13pco-yu6CQHOLHnh1gM/rs:fit:500:0:0/g:ce/aHR0cHM6Ly9kMXZ3/eGRwemJnZHFqLmNs/b3VkZnJvbnQubmV0/L3MzLXB1YmxpYy1p/bWFnZXMvcHJvZ3Jh/bS9wZy1wcm9ncmFt/LW9ubGluZS1hcnRp/ZmljaWFsLWludGVs/bGlnZW5jZS1tYWNo/aW5lLWxlYXJuaW5n/LmpwZw',
        title: 'AI and Machine Learning Course with certifications',
        price: 1100,
    },
    {
        id: 2,
        image: 'https://imgs.search.brave.com/HqfobQiKjUK3Ee9YcmDzhl6I9REUa2D9epSBkgXgYnw/rs:fit:500:0:0/g:ce/aHR0cHM6Ly90My5m/dGNkbi5uZXQvanBn/LzAyLzU0LzMzLzM2/LzM2MF9GXzI1NDMz/MzYxOF9DR0NvUWtY/bkN2MzdnaTZ2Znc4/aTF6RDZQVjFJUzBw/Vi5qcGc',
        title: 'Frontend Development Course wih free placement assistance',
        price: 230,
    },
 {
        id: 3,
        image: 'https://imgs.search.brave.com/ZdY45FDIUMjTSNgZoaGjjDDyKnxa_aftQzpxDlWvQdg/rs:fit:500:0:0/g:ce/aHR0cHM6Ly9sZWFy/bnRvY29kZXdpdGgu/bWUvd3AtY29udGVu/dC91cGxvYWRzLzIw/MTkvMDEvcHJvZ3Jh/bW1pbmctbGFuZ3Vh/Z2UuanBn',
        title: 'Backend Development With Certification',
        price: 230,
    },
 {
        id: 4,
        image: 'https://imgs.search.brave.com/gP41Xl4SLZaM7PNInIQvK6YXTWZhp8HLBscwZkxU2Ys/rs:fit:500:0:0/g:ce/aHR0cHM6Ly9pbWcu/ZnJlZXBpay5jb20v/cHJlbWl1bS1waG90/by9oaWdoLWFuZ2xl/LXZpZXctc29mdHdh/cmUtZGV2ZWxvcGVy/LXdyaXRpbmctY29k/ZS13aGlsZS11c2lu/Zy1jb21wdXRlci1k/YXRhLXN5c3RlbXMt/b2ZmaWNlXzIzNjg1/NC00NDE0NS5qcGc_/c2l6ZT02MjYmZXh0/PWpwZw',
        title: 'Fullstack Development with placement Assistance',
        price: 230,
    },
    {
        id: 5,
        image: 'https://imgs.search.brave.com/EKSIIFOZbaE24dL4jjQGOYhwqR0g5wA81wiYcD7KrCk/rs:fit:500:0:0/g:ce/aHR0cHM6Ly9jZG4u/dmVjdG9yc3RvY2su/Y29tL2kvcHJldmll/dy0xeC84OS85Ny9j/bG91ZC1jb21wdXRp/bmctYW5kLWluZm9y/bWF0aW9uLXRlY2hu/b2xvZ3ktYmFubmVy/LXZlY3Rvci0yMDg2/ODk5Ny5qcGc',
        title: 'Cloud Computing With Certification',
        price: 100,
    }
];
const categories = [...new Set(product.map((item)=>
    {return item}))]
    let i=0;
document.getElementById('root').innerHTML = categories.map((item)=>
{
    var {image, title, price} = item;
    return(
        `<div class='box'>
            <div class='img-box'>
                <img class='images' src=${image}></img>
            </div>
        <div class='bottom'>
        <p>${title}</p>
        <h2>Rs. ${price}.00</h2>`+
        "<button onclick='addtocart("+(i++)+")'>Add to cart</button>"+
        `</div>
        </div>`
    )
}).join('')

var cart =[];

function addtocart(a){
    cart.push({...categories[a]});
    displaycart();
}
function delElement(a){
    cart.splice(a, 1);
    displaycart();
}

function displaycart(){
    let j = 0, total=0;
    document.getElementById("count").innerHTML=cart.length;
    if(cart.length==0){
        document.getElementById('cartItem').innerHTML = "Your cart is empty";
        document.getElementById("total").innerHTML = "Rs."+0+".00";
    }
    else{
        document.getElementById("cartItem").innerHTML = cart.map((items)=>
        {
            var {image, title, price} = items;
            total=total+price;
            document.getElementById("total").innerHTML = "Rs. "+total+".00";
            return(
                `<div class='cart-item'>
                <div class='row-img'>
                    <img class='rowimg' src=${image}>
                </div>
                <p style='font-size:12px;'>${title}</p>
                <h2 style='font-size: 15px;'>Rs. ${price}.00</h2>`+
                "<i class='fa-solid fa-trash' onclick='delElement("+ (j++) +")'></i></div>"
            );
        }).join('');
    }

    
}


