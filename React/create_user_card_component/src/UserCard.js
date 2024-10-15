import cardBackground from './images/bg-pattern-card.svg';
import {getUserImagePath} from './utils';
import './UserCard.css';

function UserCard({name, age, bio, username}) {

    return (
        <div className="card">
            <img className="card-bcg"
                src={cardBackground}
                alt="card-background"
            />
            <img className="user-img"
                src={getUserImagePath(username)}
                alt={"user-"+username+"-image"}
            />
            <div>
                <span className="bold">{name}</span>&nbsp;
                <span className="grey">{age}</span>
            </div>
            {/* <hr style={{width: 100%}}/> */}
            <hr/>
            <p className="para">{bio}</p>
        </div>
    );
}

export default UserCard;