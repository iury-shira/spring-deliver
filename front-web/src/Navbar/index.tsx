import { Link } from "react-router-dom";
import './styles.css';
import { ReactComponent as Logo } from './logo.svg'

function Navbar (){
    return(
        <nav className="main-navbar">
            <Logo />
            <Link to="/" className="logo-text">
                Estudo Spring React
            </Link>
        </nav>
    );
}

export default Navbar;
