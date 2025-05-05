//HEADER -----------------------------------------------------
const mobileBtn = document.querySelector('.mobile-btn');
mobileBtn.addEventListener('click', () => {
    mobileBtn.classList.toggle('open')

    const mobileText = mobileBtn.querySelector('p');

    if (mobileBtn.classList.contains('open')) {
        mobileText.innerText = 'Fechar'
        document.body.style.overflowY = 'hidden'

    } else {
        mobileText.innerText = 'Menu'
        document.body.style.overflowY = 'visible'
    }

    const navDrop = document.querySelector('.nav-drop');
    navDrop.classList.toggle('hide')


})

const lightmode = document.querySelector('.light-mode-btn');
lightmode.addEventListener('click', () => {
    const header = document.querySelector('header');
    const body = document.querySelector('body');
    const nav_menu = document.querySelector('.nav-menu');


    header.classList.add('light-mode')
    body.classList.add('light-mode')
    nav_menu.classList.add('light-mode')

})
const darkmode = document.querySelector('.dark-mode-btn');
darkmode.addEventListener('click', () => {
    const header = document.querySelector('header');
    const body = document.querySelector('body');
    const nav_menu = document.querySelector('.nav-menu');



    header.classList.remove('light-mode')
    body.classList.remove('light-mode')
    nav_menu.classList.remove('light-mode')
})

const etapas = document.querySelector('.etapas');
const etapasArray = Array.from(document.querySelectorAll('.etapa'));
const prevButton = document.querySelector('.prev');
const nextButton = document.querySelector('.next');

let currentIndex = 0;

prevButton.addEventListener('click', () => {
    if (currentIndex > 0) {
        currentIndex--;
        updateCarrossel();
    }
});

nextButton.addEventListener('click', () => {
    if (currentIndex < etapasArray.length - 1) {
        currentIndex++;
        updateCarrossel();
    }
});

function updateCarrossel() {
    const offset = -currentIndex * window.innerWidth;
    etapas.style.transform = `translateX(${offset}px)`;
}

 