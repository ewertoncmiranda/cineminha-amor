import {ReactComponent as Git} from 'assets/img/Github.svg' ;
import './styles.css';

function Navbar(){

return(
    <header>
    <nav className="container">
        <div className="dsmovie-nav-content">
            <h1>Cineminha-amor </h1>
            <a href="https://github.com/ewertoncmiranda" target="_blank" rel="noreferrer">
                <div className="dsmovie-contact-container">
                    <Git/>
                    <p className="dsmovie-contact-link">/ewertoncmiranda</p>
                </div>
            </a>
        </div>
    </nav>
</header>
) ;

}

export default Navbar;