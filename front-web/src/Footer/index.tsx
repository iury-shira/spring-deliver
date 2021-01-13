import './styles.css';
import { ReactComponent as YoutubeIcon } from './youtube.svg';
import { ReactComponent as LinkedinIcon } from './linkedin.svg';
import { ReactComponent as InstagramIcon } from './instagram.svg';

function Footer() {
    return(
        <footer className="main-footer">
           App desenvolvido como projeto de estudo da Stack Java + Spring + Typescript + React 
           <div className="footer-icons">
               <a href="https://www.youtube.com" target="_new">
                <YoutubeIcon />
               </a>
               <a href="https://www.linkedin.com" target="_new">
                <LinkedinIcon />
               </a>
               <a href="https://www.instagram.com" target="_new">
                <InstagramIcon />
               </a>
           </div>
        </footer>
    );
}

export default Footer;
